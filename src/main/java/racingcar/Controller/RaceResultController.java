package racingcar.Controller;

import racingcar.Model.Domain.RaceRepository;
import racingcar.View.ViewInterface;

public class RaceResultController implements ControllerInterface {
  private final RaceRepository raceRepository;
  private final ViewInterface outputView;

  public RaceResultController(RaceRepository raceRepository, ViewInterface outputView) {
    this.raceRepository = raceRepository;
    this.outputView = outputView;
  }

  @Override
  public void run() {

  }
}
