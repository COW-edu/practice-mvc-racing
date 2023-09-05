package racingcar.common.front.adapter;

import racingcar.car.controller.CarController;
import racingcar.common.ModelView;
import racingcar.common.Request;

public class CarControllerAdapter implements MyHandlerAdapter {
	@Override
	public boolean supports(Object handler) {
		return (handler instanceof CarController);
	}

	@Override
	public ModelView handle(Request request, Object handler) {
		CarController carController = (CarController)handler;
		ModelView modelView = carController.process(request);
		return modelView;
	}
}
