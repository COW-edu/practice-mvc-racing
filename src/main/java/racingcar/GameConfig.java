package racingcar;

import racingcar.common.front.FrontController;
import racingcar.view.RacingStadium;
import racingcar.common.GameManger;

public class GameConfig {

	public RacingStadium racingStadium() {
		return new RacingStadium(gameManager());
	}

	public GameManger gameManager() {
		return new GameManger(frontController());
	}

	public FrontController frontController() {
		return new FrontController();
	}
}
