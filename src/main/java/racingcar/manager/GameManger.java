package racingcar.manager;

import java.util.List;

import racingcar.car.entity.Car;

public interface GameManger {

	void initCar(String initCars);

	void setRound(int roundCount);

	int getRound();

	List<Car> roundStart();

	void insertWinner();

	String showWinnerSheet();
}
