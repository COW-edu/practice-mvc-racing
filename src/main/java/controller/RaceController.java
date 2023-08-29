package controller;

import model.domain.RacingGame;
import view.InputView;

public class RaceController implements Runnable{

  private static final InputView inputView;
  private static final OutputView outputView;
  private static final RacingGame racingGame;
  private static final RacingManager racingManager;
  public RaceController(InputView inputView,OutputView outputView, RacingGame racingGame, RacingManager racingManager){
    this.inputView = inputView;
    this.racingGame = racingGame;
    this.racingManager = racingManager;
  }
  @Override
  public void run() {
    racingGame.register(inputView.inputCar);
    racingManager.createRound(inputView.inputRound);
    outputView.showRaceResult(racingManager.startRace(), racingManager.getRaceResult());
  }
}
