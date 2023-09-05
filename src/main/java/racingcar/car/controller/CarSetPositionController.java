package racingcar.car.controller;

import racingcar.car.service.CarService;
import racingcar.car.service.CarServiceImpl;
import racingcar.common.ModelView;
import racingcar.common.Request;

public class CarSetPositionController implements CarController {

	CarService carService = CarServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		carService.setPosition();
		ModelView modelView = new ModelView("setPosition");
		return modelView;
	}
}
