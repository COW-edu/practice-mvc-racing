package racingcar.game.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import racingcar.car.entity.Car;
import racingcar.game.entity.Winner;
import racingcar.game.model.GameRepository;
import racingcar.game.model.GameRepositoryImpl;

public class GameServiceImpl implements GameService {

	private static final GameService instance = new GameServiceImpl();

	GameRepository gameRepository = GameRepositoryImpl.getInstance();

	public static GameService getInstance() {
		return instance;
	}

	private GameServiceImpl() {
	}

	@Override
	public void saveRound(int roundCount) {
		gameRepository.saveRound(roundCount);
	}

	@Override
	public int getRound() {
		return gameRepository.getRoundCount();
	}

	@Override
	public void saveWinner(List<Car> cars) {
		gameRepository.saveWinners(checkWinner(cars));
	}

	@Override
	public String getWinnerSheet() {
		List<Winner> winners = gameRepository.findWinners();
		return winners.stream()
			.map(Winner::getName)
			.collect(Collectors.joining(", "));
	}

	private List<Winner> checkWinner(List<Car> cars) {
		return cars.stream()
			.filter(car -> car.isWinner(car, getMaxPosition(cars)))
			.map(Car::getName)
			.map(Winner::new)
			.collect(Collectors.toList());
	}

	private int getMaxPosition(List<Car> cars) {
		Car anyWinnerCar = cars.stream()
			.max(Comparator.comparingInt(Car::getPosition))
			.get();
		return anyWinnerCar.getPosition();
	}
}
