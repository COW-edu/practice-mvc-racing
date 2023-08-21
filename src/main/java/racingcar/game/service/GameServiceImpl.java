package racingcar.game.service;

import racingcar.game.model.GameRepository;

public class GameServiceImpl implements GameService {

	private final GameRepository gameRepository;

	public GameServiceImpl(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@Override
	public void saveRound(int roundCount) {
		gameRepository.saveRound(roundCount);
	}

	@Override
	public int getRound() {
		return gameRepository.getRoundCount();
	}
}
