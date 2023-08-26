package racingcar.game.controller;

import racingcar.common.ModelView;
import racingcar.common.Request;
import racingcar.game.service.GameService;
import racingcar.game.service.GameServiceImpl;

public class GameGetRoundController implements GameController{

	GameService gameService = GameServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		ModelView modelView = new ModelView("getRound");
		modelView.setModel("roundCount", gameService.getRound());
		return modelView;
	}
}
