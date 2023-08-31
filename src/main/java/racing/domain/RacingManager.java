package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingManager {

  private final RacingGame racingGame = new RacingGame();

  private final List<String> racingProcess = new ArrayList<>();

  public void registerRacingCars(StringTokenizer requestRegisterCars) {
    racingGame.addRacingCars(requestRegisterCars);
  }

  public void raceStart(int racingRoundCount) {
    IntStream.range(0, racingRoundCount)
        .mapToObj(i -> racingGame.oneGameResult() + "\n")
        .forEach(this.racingProcess::add);
  }

  public String getRacingProcess() {
    return racingProcess.stream()
        .collect(Collectors.joining());
  }

  public String getWinner() {
    return racingGame.getWinner();
  }

}
