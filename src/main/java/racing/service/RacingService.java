package racing.service;

import java.util.StringTokenizer;

public interface RacingService {

  void register(StringTokenizer requestRegisterCars);

  void start(int racingRoundCount);

  String getRacingProcess();

  String getWinner();
}
