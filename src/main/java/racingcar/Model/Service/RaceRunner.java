package racingcar.Model.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.Model.Domain.Car;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.OutputView;
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
    ((OutputView)outputView).outputRunTitle();
    int attemptTimes = raceRepository.getAttemptTimes();
    List<Car> carList = raceRepository.getCar();
    for (int i = 0; i < attemptTimes; i++) {
      Map<String, Integer> raceState = new HashMap<>();
      for (Car car : carList) {
        car.move();
        raceState.put(car.getName(), car.getPosition());
      }
      ((OutputView)outputView).outputRunState(raceState);
    }
  }
}
