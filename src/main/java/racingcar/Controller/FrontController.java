package racingcar.Controller;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
  private final Map<String, ControllerInterface> controllers = new HashMap<>();

  private final ControllerInterface raceSettingController;
  private final ControllerInterface raceRunController;
  private final ControllerInterface raceResultController;

  private FrontController(ControllerInterface raceSettingController,
      ControllerInterface raceRunController, ControllerInterface raceResultController) {
    this.raceSettingController = raceSettingController;
    this.raceRunController = raceRunController;
    this.raceResultController = raceResultController;
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
