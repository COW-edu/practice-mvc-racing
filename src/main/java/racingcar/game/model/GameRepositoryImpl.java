package racingcar.game.model;

import java.util.ArrayList;
import java.util.List;

import racingcar.game.entity.Winner;

public class GameRepositoryImpl implements GameRepository {

	private int roundCount;
	private final List<Winner> winners = new ArrayList<>();

	@Override
	public void saveRound(int roundCount) {
		this.roundCount = roundCount;
	}

	@Override
	public int getRoundCount() {
		return roundCount;
	}

}
