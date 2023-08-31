package racing.service;

import java.util.StringTokenizer;
import racing.domain.RacingManager;

public class RacingServiceImpl implements RacingService {

  private final RacingManager racingManager = new RacingManager();

  @Override
  public void register(StringTokenizer requestRegisterCars) {
    racingManager.registerRacingCars(requestRegisterCars);
  }

  @Override
  public void start(int racingRoundCount) {
    racingManager.raceStart(racingRoundCount);
  }

  @Override
  public String getRacingProcess() {
    return racingManager.getRacingProcess();
  }

  @Override
  public String getWinner() {
    return racingManager.getWinner();
  }


}
