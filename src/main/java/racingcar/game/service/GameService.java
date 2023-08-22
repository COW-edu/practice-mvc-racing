package racingcar.game.service;

import java.util.List;

import racingcar.car.entity.Car;

public interface GameService {
	void saveRound(int roundCount);

	int getRound();

	void saveWinner(List<Car> cars);

	String getWinnerSheet();
}
