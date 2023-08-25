package racingcar.Controller;

import racingcar.Model.Domain.RaceRepository;
import racingcar.View.ViewInterface;

public class RaceRunController implements ControllerInterface {
  private final RaceRepository raceRepository;
  private final ViewInterface outputView;

  public RaceRunController(RaceRepository raceRepository, ViewInterface outputView) {
    this.raceRepository = raceRepository;
    this.outputView = outputView;
  }

  @Override
  public void run() {

  }
}
