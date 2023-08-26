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
		GameController controllable = (GameController)handler;
		ModelView modelView = controllable.process(request);
		return modelView;
	}
}
