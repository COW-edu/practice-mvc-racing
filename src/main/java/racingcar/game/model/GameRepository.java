package racingcar.game.model;

import java.util.List;

import racingcar.game.entity.Winner;

public interface GameRepository {
	void saveRound(int roundCount);

	int getRoundCount();

	void saveWinners(List<Winner> winners);

	List<Winner> findWinners();
}
