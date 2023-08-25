package racingcar.Controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.Model.Domain.Car;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.InputView;
import racingcar.View.ViewInterface;

public class RaceSettingController implements ControllerInterface {
  @Override
  public void run() {
    RaceRepository raceRepository = RaceRepository.getInstance();
    ViewInterface inputView = InputView.getInstance();

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
