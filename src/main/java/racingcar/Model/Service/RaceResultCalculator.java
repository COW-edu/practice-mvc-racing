package racingcar.Model.Service;

import racingcar.Model.Domain.RaceRepository;
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

  }
}
