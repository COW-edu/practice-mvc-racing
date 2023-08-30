package racingcar;

import racingcar.controller.RaceController;
import racingcar.domain.car.CarFactory;
import racingcar.domain.car.CarFactoryImpl;
import racingcar.domain.racing.RacingGameManager;
import racingcar.domain.racing.RacingGameManagerImpl;
import racingcar.view.input.Input;
import racingcar.view.input.InputImpl;
import racingcar.view.output.Output;
import racingcar.view.output.OutputImpl;

public class AppConfig {

  public RaceController raceController() {
    return new RaceController(input(), output(), carFactory(), racingGameManager());
  }

  public Input input() {
    return new InputImpl();
  }

  public Output output() {
    return new OutputImpl();
  }

  public CarFactory carFactory() {
    return new CarFactoryImpl();
  }
  public RacingGameManager racingGameManager() {
    return new RacingGameManagerImpl();
  }
}
