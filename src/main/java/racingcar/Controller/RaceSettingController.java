package racingcar.Controller;

import racingcar.Model.Domain.RaceRepository;
import racingcar.Model.Service.RaceSetter;
import racingcar.Model.Service.ServiceInterface;
import racingcar.View.ViewInterface;

public class RaceSettingController implements ControllerInterface {
  private final RaceRepository raceRepository;
  private final ViewInterface inputView;
  private final ServiceInterface raceSetter;

  public RaceSettingController(RaceRepository raceRepository, ViewInterface inputView) {
    this.raceRepository = raceRepository;
    this.inputView = inputView;
    raceSetter = new RaceSetter(raceRepository, inputView);
  }

  @Override
  public void run() {
    raceSetter.run();
  }
}
