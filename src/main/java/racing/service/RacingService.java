package racing.service;

import java.util.List;
import java.util.StringTokenizer;
import racing.domain.RacingGame;
import racing.domain.RacingManager;

public class RacingService {
  private final RacingManager racingManager= new RacingManager();

  public void register(StringTokenizer requestRegisterCars) {
    racingManager.registerRacingCars(requestRegisterCars);
  }

  public void start(int racingRoundCount) {
    racingManager.raceStart(racingRoundCount);
  }

  public String showRace(){
    return racingManager.showRaceProcess();
  }
  public String getWinner() {
    return racingManager.getWinner();
  }


}
