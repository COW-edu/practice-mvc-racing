package racingcar.car.controller;

import java.util.Map;

import racingcar.car.service.CarService;
import racingcar.car.service.CarServiceImpl;
import racingcar.common.ModelView;
import racingcar.common.Request;

public class CarJoinController implements CarController {

	CarService carService = CarServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		Map<String, Object> params = request.getParams();
		carService.save((String)params.get(request.getRequestName()));
		ModelView modelView = new ModelView("join");
		return modelView;
	}
}
