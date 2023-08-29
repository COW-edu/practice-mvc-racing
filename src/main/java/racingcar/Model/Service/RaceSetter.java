package racingcar.Model.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.Model.Domain.Car;
import racingcar.Model.Domain.RaceRepository;
import racingcar.View.InputView;
import racingcar.View.ViewInterface;

public class RaceSetter implements ServiceInterface {
  private final RaceRepository raceRepository;
  private final ViewInterface inputView;

  public RaceSetter(RaceRepository raceRepository, ViewInterface inputView) {
    this.raceRepository = raceRepository;
    this.inputView = inputView;
  }

  @Override
  public void run() {
    List<String> carNameList = ((InputView)inputView).InputCarName();
    int attemptTimes = ((InputView)inputView).InputAttemptTimes();

    List<Car> carList = carNameList.stream()
        .map(Car::new)
        .collect(Collectors.toList());

    raceRepository.addCar(carList);

    raceRepository.saveAttemptTimes(attemptTimes);
  }
}
