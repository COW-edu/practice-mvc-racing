package racingcar;

import racingcar.game.view.RacingStadium;

public class GameRun implements Runnable {

	private final RacingStadium racingStadium;

	public GameRun(RacingStadium racingStadium) {
		this.racingStadium = racingStadium;
	}

	@Override
	public void run() {
		try {
			racingStadium.gameStart();
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
