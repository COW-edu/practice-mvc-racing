package racingcar;

import racingcar.common.front.FrontController;
import racingcar.game.view.RacingStadium;
import racingcar.manager.GameManger;
import racingcar.manager.GameMangerImpl;

public class GameConfig {

	public RacingStadium racingStadium() {
		return new RacingStadium(gameManager());
	}

	public GameManger gameManager() {
		return new GameMangerImpl(frontController());
	}

	public FrontController frontController() {
		return new FrontController();
	}

}
