package controller;

import model.domain.RacingManager;
import view.InputView;
import view.OutputView;

public class FrontController implements Runnable{

  private final InputView inputView;
  private final OutputView outputView;
  private final RacingManager racingManager;
  public FrontController(InputView inputView, OutputView outputView, RacingManager racingManager){
    this.inputView = inputView;
    this.outputView = outputView;
    this.racingManager = racingManager;
  }
  @Override
  public void run() {
    racingManager.register(inputView.inputCar());
    outputView.showRace(racingManager.startRace(inputView.inputRound()));
    outputView.showRaceResult(racingManager.getRaceResult());
  }
}
