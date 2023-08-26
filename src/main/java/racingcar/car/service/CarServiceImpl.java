package racingcar.car.service;

import java.util.List;

import racingcar.car.entity.Car;
import racingcar.car.model.CarRepository;
import racingcar.car.model.CarRepositoryImpl;

public class CarServiceImpl implements CarService {

	private static final CarService instance = new CarServiceImpl();
	CarRepository carRepository = CarRepositoryImpl.getInstance();

	public static CarService getInstance() {
		return instance;
	}

	private CarServiceImpl() {
	}

	@Override
	public void save(String initCars) {
		carRepository.saveCar(initCars);
	}

	@Override
	public void setPosition() {
		carRepository.setPosition();
	}

	@Override
	public List<Car> findAll() {
		return carRepository.findCars();
	}
}
