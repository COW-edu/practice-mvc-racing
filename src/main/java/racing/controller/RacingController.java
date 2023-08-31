package racing.controller;

import java.util.List;
import java.util.StringTokenizer;
import racing.service.RacingService;

public class RacingController {
  private final RacingService racingService;

  public RacingController(RacingService racingService){
    this.racingService=racingService;
  }

  public String startRace(StringTokenizer requestRegisterCars, int round) {
    register(requestRegisterCars);
    start(round);
    return showRacing();
  }

  private void register(StringTokenizer requestRegisterCars) {
    racingService.register(requestRegisterCars);
  }

  private void start(int racingRoundCount) {
     racingService.start(racingRoundCount);
  }

  private String showRacing(){
    return racingService.showRace();
  }

  public String getWinner() {
    return racingService.getWinner();
  }


}
