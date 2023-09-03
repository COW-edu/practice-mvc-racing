package racingcar.Controller;

import racingcar.Model.Domain.RaceRepository;
import racingcar.Service.RaceRunner;
import racingcar.Service.ServiceInterface;
import racingcar.View.ViewInterface;

public class RaceRunController implements ControllerInterface {

  private final RaceRepository raceRepository;
  private final ViewInterface outputView;
  private final ServiceInterface raceRunner;

  public RaceRunController(RaceRepository raceRepository, ViewInterface outputView) {
    this.raceRepository = raceRepository;
    this.outputView = outputView;
    raceRunner = new RaceRunner(raceRepository, outputView);
  }

  @Override
  public void run() {
    raceRunner.run();
  }
}
