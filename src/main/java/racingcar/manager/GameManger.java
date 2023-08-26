package racingcar.manager;

import java.util.List;

import racingcar.car.entity.Car;

public interface GameManger {

	void initGame(String initCars, int roundCount);

	int getRound();

	void roundStart();

	List<Car> getCars();

	void insertWinner();

	String showWinnerSheet();
}
