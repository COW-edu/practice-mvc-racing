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
    ControllerInterface raceSettingController = new RaceSettingController();
    ControllerInterface raceRunController = new RaceRunController();
    ControllerInterface raceResultController = new RaceResultController();

    RaceRepository raceRepository = new RaceRepository();

    ViewInterface inputView = new InputView();
    ViewInterface outputView = new OutputView();

    FrontController frontController = new FrontController(raceSettingController, raceRunController, raceResultController, raceRepository, inputView, outputView);

    return frontController;
  }
}
