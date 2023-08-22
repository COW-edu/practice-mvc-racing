package racingcar.Controller;

public class RaceSettingController implements ControllerInterface {
  private static ControllerInterface instance = null;

  private RaceSettingController() {}

  public static ControllerInterface getInstance() {
    if (instance == null)
      instance = new RaceSettingController();
    return instance;
  }
}
