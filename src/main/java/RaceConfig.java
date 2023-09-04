import frontcontroller.FrontController;
import racing.controller.RacingController;
import racing.service.RacingServiceImpl;
import view.InputView;
import view.InputViewImpl;
import view.OutputView;
import view.OutputViewImpl;

public class RaceConfig {


  public FrontController frontController() {
    return new FrontController(inputView(), outputView(), racingController());
  }

  private InputView inputView() {
    return new InputViewImpl();
  }

  private OutputView outputView() {
    return new OutputViewImpl();
  }

  private RacingController racingController() {
    return new RacingController(new RacingServiceImpl());
  }
}
