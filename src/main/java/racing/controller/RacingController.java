package racing.controller;

import java.util.StringTokenizer;
import racing.service.RacingServiceImpl;

public class RacingController {

  private final RacingServiceImpl racingServiceImpl;

  public RacingController(RacingServiceImpl racingServiceImpl) {
    this.racingServiceImpl = racingServiceImpl;
  }

  public String startRace(StringTokenizer requestRegisterCars, int round) {
    register(requestRegisterCars);
    start(round);
    return getRacingProcess();
  }

  private void register(StringTokenizer requestRegisterCars) {
    racingServiceImpl.register(requestRegisterCars);
  }

  private void start(int racingRoundCount) {
    racingServiceImpl.start(racingRoundCount);
  }

  private String getRacingProcess() {
    return racingServiceImpl.getRacingProcess();
  }

  public String getWinner() {
    return racingServiceImpl.getWinner();
  }


}
