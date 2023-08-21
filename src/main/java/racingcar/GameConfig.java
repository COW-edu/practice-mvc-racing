package racingcar;

import racingcar.game.controller.GameController;
import racingcar.game.controller.GameControllerImpl;
import racingcar.game.model.GameRepository;
import racingcar.game.model.GameRepositoryImpl;
import racingcar.game.service.GameService;
import racingcar.game.service.GameServiceImpl;
import racingcar.game.view.RacingStadium;
import racingcar.manager.GameManger;
import racingcar.manager.GameMangerImpl;
import racingcar.car.controller.CarController;
import racingcar.car.controller.CarControllerImpl;
import racingcar.car.model.CarRepository;
import racingcar.car.model.CarRepositoryImpl;
import racingcar.car.service.CarService;
import racingcar.car.service.CarServiceImpl;

public class GameConfig {

	public RacingStadium racingStadium() {
		return new RacingStadium(gameManager());
	}

	public GameManger gameManager() {
		return new GameMangerImpl(gameController(), carController());
	}

	public GameController gameController() {
		return new GameControllerImpl(gameService());
	}

	public GameService gameService() {
		return new GameServiceImpl(gameRepository());
	}

	public GameRepository gameRepository() {
		return new GameRepositoryImpl();
	}

	public CarController carController() {
		return new CarControllerImpl(carService());
	}

	public CarService carService() {
		return new CarServiceImpl(carRepository());
	}

	public CarRepository carRepository() {
		return new CarRepositoryImpl();
	}

}
