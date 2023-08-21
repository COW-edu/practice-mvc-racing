package racingcar.car.model;

import java.util.List;

import racingcar.car.entity.Car;

public interface CarRepository {

	void saveCar(String initCars);

	List<Car> findCars();

	void setPosition();
}
