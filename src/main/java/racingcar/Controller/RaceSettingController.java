package racingcar.Controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.Model.Domain.Car;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.InputView;

public class RaceSettingController implements ControllerInterface {
  private static ControllerInterface instance = null;

  private RaceSettingController() {}

  public static ControllerInterface getInstance() {
    if (instance == null)
      instance = new RaceSettingController();
    return instance;
  }

  @Override
  public void run() {
    RaceRepository raceRepository = RaceRepository.getInstance();
    InputView inputView = InputView.getInstance();

    List<String> carNameList = inputView.InputCarName();
    int attemptTimes = inputView.InputAttemptTimes();

    List<Car> carList = new ArrayList<>();
    for (String s : carNameList) {
      Car car = new Car(s);
      carList.add(car);
    }
    raceRepository.addCar(carList);

    raceRepository.saveAttemptTimes(attemptTimes);
  }
}
