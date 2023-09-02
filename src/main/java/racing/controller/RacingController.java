package racing.controller;

import java.util.StringTokenizer;
import racing.service.RacingService;

public class RacingController {

  private final RacingService racingService;

  public RacingController(RacingService racingService) {
    this.racingService = racingService;
  }

  public String startRace(StringTokenizer requestRegisterCars, int round) {
    register(requestRegisterCars);
    start(round);
    return getRacingProcess();
  }

  public String getWinner() {
    return racingService.getWinner();
  }


  private void register(StringTokenizer requestRegisterCars) {
    racingService.register(requestRegisterCars);
  }

  private void start(int racingRoundCount) {
    racingService.start(racingRoundCount);
  }

  private String getRacingProcess() {
    return racingService.getRacingProcess();
  }


}
