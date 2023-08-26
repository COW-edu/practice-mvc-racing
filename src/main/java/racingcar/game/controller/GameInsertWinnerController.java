package racingcar.game.controller;

import java.util.Collections;
import java.util.List;

import racingcar.car.entity.Car;
import racingcar.common.ModelView;
import racingcar.common.Request;
import racingcar.game.service.GameService;
import racingcar.game.service.GameServiceImpl;

public class GameInsertWinnerController implements GameController {

	GameService gameService = GameServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		gameService.saveWinner(Collections.unmodifiableList((List<Car>)request.getParams().get("cars")));
		ModelView modelView = new ModelView("saveWinner");
		return modelView;
	}
}
