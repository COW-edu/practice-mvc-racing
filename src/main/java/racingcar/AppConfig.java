package racingcar;

import racingcar.controller.RaceController;
import racingcar.domain.racing.RacingGameManager;
import racingcar.domain.racing.RacingGameManagerImpl;
import racingcar.view.input.Input;
import racingcar.view.input.InputImpl;
import racingcar.view.output.Output;
import racingcar.view.output.OutputImpl;

public class AppConfig {

  public RaceController raceController() {
    return new RaceController(input(), output(), racingGameManager());
  }

  public Input input() {
    return new InputImpl();
  }

  public Output output() {
    return new OutputImpl();
  }

  public RacingGameManager racingGameManager() {
    return new RacingGameManagerImpl();
  }
}
