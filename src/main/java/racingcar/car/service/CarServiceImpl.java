package racingcar.car.service;

import java.util.List;
import java.util.StringTokenizer;

import racingcar.car.entity.Car;
import racingcar.car.model.CarRepository;
import racingcar.car.model.CarRepositoryImpl;

public class CarServiceImpl implements CarService {

	private static final int MIN_SIZE = 1;

	private static final CarService instance = new CarServiceImpl();
	CarRepository carRepository = CarRepositoryImpl.getInstance();

	public static CarService getInstance() {
		return instance;
	}

	private CarServiceImpl() {
	}

	@Override
	public void save(String initCars) {
		splitInitCar(initCars);
		validate();
	}

	@Override
	public void setPosition() {
		carRepository.setPosition();
	}

	@Override
	public List<Car> findAll() {
		return carRepository.findCars();
	}

	private void splitInitCar(String initCars) {
		StringTokenizer stringTokenizer = new StringTokenizer(initCars, ",");
		while (stringTokenizer.hasMoreTokens()) {
			Car newCar = new Car(stringTokenizer.nextToken());
			carRepository.saveCar(newCar);
		}
	}

	private void validate() {
		if (!isEnoughCars()) {
			throw new IllegalArgumentException("[ERROR] 최소 출전 차량 수는 2 입니다.");
		}
	}

	private boolean isEnoughCars() {
		return findAll().size() > MIN_SIZE;
	}
}
