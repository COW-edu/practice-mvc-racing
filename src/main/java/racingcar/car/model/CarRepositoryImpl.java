package racingcar.car.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import racingcar.car.entity.Car;

public class CarRepositoryImpl implements CarRepository {

	private final List<Car> cars = new ArrayList<>();

	private static final CarRepository instance = new CarRepositoryImpl();

	public static CarRepository getInstance() {
		return instance;
	}

	private CarRepositoryImpl() {
	}

	@Override
	public void saveCar(Car newCar) {
		cars.add(newCar);
	}

	@Override
	public List<Car> findCars() {
		return Collections.unmodifiableList(cars);
	}

	@Override
	public void setPosition() {
		cars.forEach(Car::randomPosition);
	}
}
