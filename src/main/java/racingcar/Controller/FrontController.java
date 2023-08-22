package racingcar.Controller;

import java.util.HashMap;
import java.util.Map;
import racingcar.View.InputView;
import racingcar.View.OutputView;
import racingcar.View.ViewInterface;

public class FrontController {
  private static FrontController instance = null;

  private final Map<String, ControllerInterface> controllers = new HashMap<>();
  private final Map<String, ViewInterface> views = new HashMap<>();

  private FrontController() {
    initControllers();
    initViews();
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

  private void initViews() {
    views.put("InputView", InputView.getInstance());
    views.put("OutputView", OutputView.getInstance());
  }

  public void service(String message) {
    ControllerInterface controller = controllers.get(message);
  }
}
