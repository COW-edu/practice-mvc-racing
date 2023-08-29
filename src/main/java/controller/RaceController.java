package controller;

import model.domain.RacingManager;
import view.InputView;
import view.OutputView;

public class RaceController implements Runnable{

  private final InputView inputView;
  private final OutputView outputView;
  private final RacingManager racingManager;
  public RaceController(InputView inputView, OutputView outputView, RacingManager racingManager){
    this.inputView = inputView;
    this.outputView = outputView;
    this.racingManager = racingManager;
  }
  @Override
  public void run() {
    racingManager.register(inputView.inputCar());
    racingManager.createRound(inputView.inputRound());
    outputView.showRace(racingManager.startRace());
    outputView.showRaceResult(racingManager.getRaceResult());
  }
}
