package racingcar.game.controller;

import java.util.List;

import racingcar.car.entity.Car;

public interface GameController {
	void setRound(int roundCount);

	int getRound();

	void insertWinner(List<Car> cars);

	String getWinnerSheet();
}
