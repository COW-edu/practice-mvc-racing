package racingcar.Controller;

import java.util.HashMap;
import java.util.Map;
import racingcar.View.OutputView;
import racingcar.View.ViewInterface;

public class FrontController {
  private final Map<String, ControllerInterface> controllers = new HashMap<>();

  private final ControllerInterface raceSettingController;
  private final ControllerInterface raceRunController;
  private final ControllerInterface raceResultController;

  private final ViewInterface inputView;
  private final OutputView outputView;

  private FrontController(ControllerInterface raceSettingController,
      ControllerInterface raceRunController, ControllerInterface raceResultController,
      ViewInterface inputView, OutputView outputView) {
    this.raceSettingController = raceSettingController;
    this.raceRunController = raceRunController;
    this.raceResultController = raceResultController;
    this.inputView = inputView;
    this.outputView = outputView;
    initControllers();
  }

  private void initControllers() {
    controllers.put("RaceSetting", raceSettingController);
    controllers.put("RaceRun", raceRunController);
    controllers.put("RaceResult", raceResultController);
  }

  public void service(String message) {
    ControllerInterface controller = controllers.get(message);
    controller.run();
  }
}
