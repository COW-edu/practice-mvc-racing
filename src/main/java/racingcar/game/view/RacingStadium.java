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

	public void gameStart() {
		initCar();
		gameSetting();
		gameResult();
		showWinnerSheet();
	}

	private void initCar() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String initCars = Console.readLine();
		gameManger.initCar(initCars);
	}

	private void gameSetting() {
		System.out.println("시도할 회수는 몇회인가요?");
		int roundCount = Integer.parseInt(Console.readLine());
		gameManger.setRound(roundCount);
	}

	private void gameResult() {
		System.out.println("실행 결과");
		for (int count = 0; count < gameManger.getRound(); count++) {
			resultSheet(gameManger.roundStart());
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
