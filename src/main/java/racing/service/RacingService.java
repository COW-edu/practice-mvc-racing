package racing.service;

import java.util.List;

public interface RacingService {

  void register(List<String> requestRegisterCars);

  void start(int racingRoundCount);

  String getRacingProcess();

  String getWinner();
}
