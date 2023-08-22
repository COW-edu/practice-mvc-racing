package racingcar.Controller;

import java.util.HashMap;
import java.util.Map;

public class FrontController implements ControllerInterface {
  private static ControllerInterface instance = null;

  private final Map<String, Object> controllers = new HashMap<>();

  private FrontController() {
    initControllers();
  }

  public static ControllerInterface getInstance() {
    if (instance == null)
      instance = new FrontController();
    return instance;
  }

  private void initControllers() {
    controllers.put("RaceSetting", RaceSettingController.getInstance());
    controllers.put("RaceResult", RaceResultController.getInstance());
    controllers.put("RaceRun", RaceRunController.getInstance());
  }
}
