package racingcar.front.adapter;

import racingcar.car.controller.CarController;
import racingcar.front.ModelView;
import racingcar.front.Request;

public class CarControllerAdapter implements MyHandlerAdapter {
	@Override
	public boolean supports(Object handler) {
		return (handler instanceof CarController);
	}

	@Override
	public ModelView handle(Request request, Object handler) {
		CarController controllable = (CarController) handler;
		ModelView modelView = controllable.process(request);
		return modelView;
	}
}
