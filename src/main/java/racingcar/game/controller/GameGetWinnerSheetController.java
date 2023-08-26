package racingcar.game.controller;

import racingcar.common.ModelView;
import racingcar.common.Request;
import racingcar.game.service.GameService;
import racingcar.game.service.GameServiceImpl;

public class GameGetWinnerSheetController implements GameController{

	GameService gameService = GameServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		ModelView modelView = new ModelView("showWinnerSheet");
		modelView.setModel("winnerSheet", gameService.getWinnerSheet());
		return modelView;
	}
}
