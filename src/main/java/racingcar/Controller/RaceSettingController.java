package racingcar.Controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.Model.Domain.Car;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.InputView;
import racingcar.View.ViewInterface;

public class RaceSettingController implements ControllerInterface {
  private final RaceRepository raceRepository;
  private final ViewInterface inputView;

  public RaceSettingController(RaceRepository raceRepository, ViewInterface inputView) {
    this.raceRepository = raceRepository;
    this.inputView = inputView;
  }

  @Override
  public void run() {
    List<String> carNameList = ((InputView)inputView).InputCarName();
    int attemptTimes = ((InputView)inputView).InputAttemptTimes();

    List<Car> carList = new ArrayList<>();
    for (String s : carNameList) {
      Car car = new Car(s);
      carList.add(car);
    }
    raceRepository.addCar(carList);

    raceRepository.saveAttemptTimes(attemptTimes);
  }
}
