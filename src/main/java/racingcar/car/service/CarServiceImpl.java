package racingcar.car.service;

import java.util.List;

import racingcar.car.entity.Car;
import racingcar.car.model.CarRepository;

public class CarServiceImpl implements CarService {

	private final CarRepository carRepository;

	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
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
