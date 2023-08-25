package racingcar;

import racingcar.Controller.ControllerInterface;
import racingcar.Controller.FrontController;
import racingcar.Controller.RaceResultController;
import racingcar.Controller.RaceRunController;
import racingcar.Controller.RaceSettingController;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.InputView;
import racingcar.View.OutputView;
import racingcar.View.ViewInterface;

public class RunConfig {
  public FrontController runConfig() {
    RaceRepository raceRepository = new RaceRepository();

    ViewInterface inputView = new InputView();
    ViewInterface outputView = new OutputView();

    ControllerInterface raceSettingController = new RaceSettingController(raceRepository, inputView);
    ControllerInterface raceRunController = new RaceRunController(raceRepository, outputView);
    ControllerInterface raceResultController = new RaceResultController(raceRepository, outputView);

    FrontController frontController = new FrontController(raceSettingController, raceRunController, raceResultController, raceRepository, inputView, outputView);

    return frontController;
  }
}
