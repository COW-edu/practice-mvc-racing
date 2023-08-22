package racingcar.Controller;

import java.util.HashMap;
import java.util.Map;
import racingcar.View.InputView;
import racingcar.View.OutputView;
import racingcar.View.ViewInterface;

public class FrontController {
  private static FrontController instance = null;

  private final Map<String, ControllerInterface> controllers = new HashMap<>();

  private FrontController() {
    initControllers();
  }

  public static FrontController getInstance() {
    if (instance == null)
      instance = new FrontController();
    return instance;
  }

  private void initControllers() {
    controllers.put("RaceSetting", RaceSettingController.getInstance());
    controllers.put("RaceResult", RaceResultController.getInstance());
    controllers.put("RaceRun", RaceRunController.getInstance());
  }

  public void service(String message) {
    ControllerInterface controller = controllers.get(message);
  }
}
