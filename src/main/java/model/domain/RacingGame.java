package model.domain;

import java.util.List;
import java.util.StringTokenizer;
import model.service.RacingGameService;

public class RacingGame {

  private final RacingGameService racingGameService;

  public RacingGame(RacingGameService racingGameService){
    this.racingGameService=racingGameService;
  }

  public void register(StringTokenizer requestRegisterCars) {
    racingGameService.register(requestRegisterCars);
  }

  public List<String> start(int racingRoundCount) {
    return racingGameService.start(racingRoundCount);
  }

  public String checkWinner() {
    return racingGameService.checkWinner();
  }
}
