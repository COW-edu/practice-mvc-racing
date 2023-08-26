package racingcar.game.controller;

import racingcar.common.ModelView;
import racingcar.common.Request;
import racingcar.game.service.GameService;
import racingcar.game.service.GameServiceImpl;

public class GameSetRoundController implements GameController {
	GameService gameService = GameServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		gameService.saveRound((Integer)request.getParams().get("roundCount"));
		ModelView modelView = new ModelView("setRound");
		return modelView;
	}
}
