package car;

import java.util.Arrays;
import java.util.List;

public class ConsoleUI {
    private static final String ERROR_PREFIX = "[ERROR] ";

    public static void main(String[] args) {
        Console console = new Console();
        String carNamesInput = console.readLine("경주 할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> carNames = Arrays.asList(carNamesInput.split(","));

        int tryCount;
        try {
            String tryCountInput = console.readLine("시도할 회수는 몇회인가요?");
            tryCount = Integer.parseInt(tryCountInput);
        } catch (NumberFormatException e) {
            console.printLine(ERROR_PREFIX + "시도 횟수는 숫자여야 합니다.");
            return;
        }

        GameController gameController = new GameController(carNames);

        for (int i = 0; i < tryCount; i++) {
            gameController.moveCars();
            printCarPositions(gameController);
            console.printLine("");
        }

        printWinners(gameController, console);
    }

    private static void printCarPositions(GameController gameController) {
        List<String> carNames = gameController.getCarNames();
        List<Integer> carPositions = gameController.getCarPositions();

        for (int i = 0; i < carNames.size(); i++) {
            String carName = carNames.get(i);
            int carPosition = carPositions.get(i);
            Console console = null;
			console.printLine(carName + " : " + "-".repeat(carPosition));
        }
    }

    private static void printWinners(GameController gameController, Console console) {
        List<String> winners = gameController.getWinners();
        String winnersString = String.join(", ", winners);
        console.printLine("최종 우승자 : " + winnersString);
    }
}
