package racingcar.common.front.adapter;

import racingcar.common.ModelView;
import racingcar.common.Request;
import racingcar.game.controller.GameController;

public class GameControllerAdapter implements MyHandlerAdapter {
	@Override
	public boolean supports(Object handler) {
		return (handler instanceof GameController);
	}

	@Override
	public ModelView handle(Request request, Object handler) {
		GameController gameController = (GameController)handler;
		ModelView modelView = gameController.process(request);
		return modelView;
	}
}
