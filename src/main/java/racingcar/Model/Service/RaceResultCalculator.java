package racingcar.Model.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.OutputView;
import racingcar.View.ViewInterface;

public class RaceResultCalculator implements ServiceInterface {

  private final RaceRepository raceRepository;
  private final ViewInterface outputView;

  public RaceResultCalculator(RaceRepository raceRepository, ViewInterface outputView) {
    this.raceRepository = raceRepository;
    this.outputView = outputView;
  }

  @Override
  public void run() {
    Map<String, Integer> raceState = raceRepository.getRaceState();
    int maxValue = Collections.max(raceState.values());
    List<String> maxKeys = raceState.entrySet().stream()
        .filter(entry -> entry.getValue() == maxValue)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
    ((OutputView) outputView).outputResult(maxKeys);
  }
}
