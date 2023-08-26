package racingcar.car.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

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
	public void saveCar(String initCars) {
		splitInitCar(initCars);
	}

	@Override
	public List<Car> findCars() {
		return Collections.unmodifiableList(cars);
	}

	@Override
	public void setPosition() {
		cars.forEach(Car::randomPosition);
	}

	private void splitInitCar(String initCars) {
		StringTokenizer stringTokenizer = new StringTokenizer(initCars, ",");
		while (stringTokenizer.hasMoreTokens()) {
			Car newCar = new Car(stringTokenizer.nextToken());
			cars.add(newCar);
		}
	}
}
