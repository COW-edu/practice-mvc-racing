package racingcar.car.controller;

import java.util.List;

import racingcar.car.entity.Car;

public interface CarController {
	void join(String initCars);

	void setPosition();

	List<Car> getCars();
}
