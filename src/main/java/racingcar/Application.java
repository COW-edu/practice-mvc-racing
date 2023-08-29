package racingcar;

import racingcar.view.RacingStadium;

public class Application {
	public static void main(String[] args) {
		GameConfig gameConfig = new GameConfig();
		RacingStadium racingStadium = gameConfig.racingStadium();
		GameRun gameRun = new GameRun(racingStadium);
		gameRun.run();
	}
}
