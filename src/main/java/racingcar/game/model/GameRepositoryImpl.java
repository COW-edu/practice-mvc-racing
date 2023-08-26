package racingcar.game.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import racingcar.game.entity.Winner;

public class GameRepositoryImpl implements GameRepository {

	private int roundCount;
	private List<Winner> winners = new ArrayList<>();

	private static final GameRepository instance = new GameRepositoryImpl();

	public static GameRepository getInstance() {
		return instance;
	}

	private GameRepositoryImpl() {
	}

	@Override
	public void saveRound(int roundCount) {
		this.roundCount = roundCount;
	}

	@Override
	public int getRoundCount() {
		return roundCount;
	}

	@Override
	public void saveWinners(List<Winner> winners) {
		this.winners = winners;
	}

	@Override
	public List<Winner> findWinners() {
		return Collections.unmodifiableList(winners);
	}
}
