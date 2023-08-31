package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class RacingManager {

  private final RacingGame racingGame = new RacingGame();

  private final List<String> racingProcess = new ArrayList<>();

  public void registerRacingCars(StringTokenizer requestRegisterCars){
    racingGame.addRacingCars(requestRegisterCars);
  }

  public void raceStart(int racingRoundCount) {
    for (int i = 0; i < racingRoundCount; i++) {
      this.racingProcess.add(racingGame.oneGameResult()+"\n");
    }
  }

  public String showRaceProcess(){

//    String raceProcess ="";
//
//    for(int i=0; i<racingProcess.size(); i++){
//      raceProcess = raceProcess+racingProcess.get(i);
//    }

    return racingProcess.stream()
        .collect(Collectors.joining());
  }

}
