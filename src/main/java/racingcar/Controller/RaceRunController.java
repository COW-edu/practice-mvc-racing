package racingcar.Controller;

public class RaceRunController implements ControllerInterface {
  private static ControllerInterface instance = null;

  private RaceRunController() {}

  public static ControllerInterface getInstance() {
    if (instance == null)
      instance = new RaceRunController();
    return instance;
  }

  @Override
  public void run() {

  }
}
