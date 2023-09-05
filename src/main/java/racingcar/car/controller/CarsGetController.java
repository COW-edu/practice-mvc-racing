package racingcar.car.controller;

import racingcar.car.service.CarService;
import racingcar.car.service.CarServiceImpl;
import racingcar.common.ModelView;
import racingcar.common.Request;

public class CarsGetController implements CarController {

	CarService carService = CarServiceImpl.getInstance();

	@Override
	public ModelView process(Request request) {
		ModelView modelView = new ModelView("getCars");
		modelView.setModel("cars", carService.findAll());
		return modelView;
	}

}
