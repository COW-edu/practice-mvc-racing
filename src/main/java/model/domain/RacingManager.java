package model.domain;

import java.util.List;
import java.util.StringTokenizer;
import model.service.RacingGameService;

public class RacingManager {

  private final RacingGame racingGame = new RacingGame(new RacingGameService());

  public void register(StringTokenizer requestRegisterCars) {
    racingGame.register(requestRegisterCars);
  }

  public List<String> startRace(int racingRoundCount) {
    return racingGame.start(racingRoundCount);
  }

  public String getRaceResult() {
    return racingGame.checkWinner();
  }
}
