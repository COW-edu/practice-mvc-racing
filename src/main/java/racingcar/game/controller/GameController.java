package racingcar.game.controller;

import racingcar.common.ModelView;
import racingcar.common.Request;

public interface GameController {
	ModelView process(Request request);
}
