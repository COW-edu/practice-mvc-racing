package racingcar;

import racingcar.view.RacingStadium;

public class GameRun implements Runnable {

	private final RacingStadium racingStadium;

	public GameRun(RacingStadium racingStadium) {
		this.racingStadium = racingStadium;
	}

	@Override
	public void run() {
		try {
			racingStadium.gameProcess();
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
