package racingcar.game.controller;

import java.util.List;

import racingcar.car.entity.Car;
import racingcar.game.service.GameService;

public class GameControllerImpl implements GameController {

	private final GameService gameService;

	public GameControllerImpl(GameService gameService) {
		this.gameService = gameService;
	}

	@Override
	public void setRound(int roundCount) {
		gameService.saveRound(roundCount);
	}

	@Override
	public int getRound() {
		return gameService.getRound();
	}

	@Override
	public void insertWinner(List<Car> cars) {
		gameService.saveWinner(cars);
	}

	@Override
	public String getWinnerSheet() {
		return gameService.getWinnerSheet();
	}

}
