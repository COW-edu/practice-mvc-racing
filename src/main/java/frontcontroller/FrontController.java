package frontcontroller;

import racing.controller.RacingController;
import view.InputView;
import view.OutputView;

public class FrontController implements Runnable {

  private final InputView inputView;
  private final OutputView outputView;
  private final RacingController racingController;

  public FrontController(InputView inputView, OutputView outputView,
      RacingController racingController) {
    this.inputView = inputView;
    this.outputView = outputView;
    this.racingController = racingController;
  }

  @Override
  public void run() {
    try {
      outputView.showRace(racingController.startRace(inputView.inputCar(), inputView.inputRound()));
      outputView.showWinner(racingController.getWinner());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
