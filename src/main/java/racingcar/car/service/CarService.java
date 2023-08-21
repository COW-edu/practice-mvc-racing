package racingcar.car.service;

import java.util.List;

import racingcar.car.entity.Car;

public interface CarService {
	void save(String initCars);

	void setPosition();

	List<Car> findAll();
}
