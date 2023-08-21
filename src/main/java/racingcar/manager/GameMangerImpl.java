package racingcar.manager;

import java.util.List;

import racingcar.game.controller.GameController;
import racingcar.car.controller.CarController;
import racingcar.car.entity.Car;

public class GameMangerImpl implements GameManger {

	private final GameController gameController;
	private final CarController carController;

	public GameMangerImpl(GameController gameController, CarController carController) {
		this.gameController = gameController;
		this.carController = carController;
	}

	@Override
	public void initCar(String initCars) {
		carController.join(initCars);
	}

	@Override
	public void setRound(int roundCount) {
		gameController.setRound(roundCount);
	}

	@Override
	public int getRound() {
		return gameController.getRound();
	}

	@Override
	public List<Car> roundStart() {
		carController.setPosition();
		return carController.getCars();
	}
}
