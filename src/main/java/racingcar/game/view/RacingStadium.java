package racingcar.game.view;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.manager.GameManger;
import racingcar.car.entity.Car;

public class RacingStadium {
	private final GameManger gameManger;

	public RacingStadium(GameManger gameManger) {
		this.gameManger = gameManger;
	}

	public void gameProcess() {
		gameManger.initGame(initCar(), initRound());
		gameResult();
		showWinnerSheet();
	}

	private String initCar() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String initCars = Console.readLine();
		return initCars;
	}

	private int initRound() {
		System.out.println("시도할 회수는 몇회인가요?");
		int roundCount = Integer.parseInt(Console.readLine());
		return roundCount;
	}

	private void gameResult() {
		System.out.println("실행 결과");
		for (int count = 0; count < gameManger.getRound(); count++) {
			gameManger.roundStart();
			resultSheet(gameManger.getCars());
		}
		gameManger.insertWinner();
	}

	private void resultSheet(List<Car> cars) {
		cars.stream()
			.forEach(this::getEachCarResult);
		System.out.println();
	}

	private void getEachCarResult(Car car) {
		System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
	}

	private void showWinnerSheet() {
		System.out.println("최종 우승자 : " + gameManger.showWinnerSheet());
	}
}
