package racingcar.Model.Service;

import racingcar.Model.Domain.RaceRepository;
import racingcar.View.ViewInterface;

public class RaceRunner implements ServiceInterface {
  private final RaceRepository raceRepository;
  private final ViewInterface outputView;

  public RaceRunner(RaceRepository raceRepository, ViewInterface outputView) {
    this.raceRepository = raceRepository;
    this.outputView = outputView;
  }

  @Override
  public void run() {

  }
}
