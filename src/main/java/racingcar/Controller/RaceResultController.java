package racingcar.Controller;

public class RaceResultController implements ControllerInterface {
  private static ControllerInterface instance = null;

  private RaceResultController() {}

  public static ControllerInterface getInstance() {
    if (instance == null)
      instance = new RaceResultController();
    return instance;
  }
}
