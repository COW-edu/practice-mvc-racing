package racingcar.View;

public class OutputView implements ViewInterface {
  private static ViewInterface instance = null;

  private OutputView() {};

  public static ViewInterface getInstance() {
    if (instance == null)
      instance = new OutputView();
    return instance;
  }

  @Override
  public void render() {

  }
}
