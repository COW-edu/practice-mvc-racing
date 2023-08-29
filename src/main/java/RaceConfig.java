import controller.RaceController;
import model.domain.RacingGame;
import model.domain.RacingManager;
import view.InputView;
import view.InputViewImpl;
import view.OutputView;
import view.OutputViewImpl;

public class RaceConfig {


  public RaceController raceController() {
    return new RaceController(inputView(), outputView(), racingManager());
  }

  private InputView inputView(){
    return new InputViewImpl();
  }
  private OutputView outputView() {
    return new OutputViewImpl();
  }
  private RacingManager racingManager(){
    return new RacingManager();
  }
}
