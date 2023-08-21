package racingcar.game.model;

public interface GameRepository {
	void saveRound(int roundCount);

	int getRoundCount();
}
