package racingcar.Controller;

import racingcar.Model.Domain.RaceRepository;
import racingcar.Model.Service.RaceResultCalculator;
import racingcar.View.ViewInterface;

public class RaceResultController implements ControllerInterface {

  private final RaceRepository raceRepository;
  private final ViewInterface outputView;
  private final RaceResultCalculator raceResultCalculator;

  public RaceResultController(RaceRepository raceRepository, ViewInterface outputView) {
    this.raceRepository = raceRepository;
    this.outputView = outputView;
    raceResultCalculator = new RaceResultCalculator(raceRepository, outputView);
  }

  @Override
  public void run() {
    raceResultCalculator.run();
  }
}
