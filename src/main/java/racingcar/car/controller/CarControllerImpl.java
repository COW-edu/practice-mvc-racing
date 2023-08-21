package racingcar.car.controller;

import java.util.List;

import racingcar.car.entity.Car;
import racingcar.car.service.CarService;

public class CarControllerImpl implements CarController {

	private final CarService carService;

	public CarControllerImpl(CarService carService) {
		this.carService = carService;
	}

	@Override
	public void join(String initCars) {
		carService.save(initCars);
	}

	@Override
	public void setPosition() {
		carService.setPosition();
	}

	@Override
	public List<Car> getCars() {
		return carService.findAll();
	}
}
