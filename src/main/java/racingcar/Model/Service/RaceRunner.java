package racingcar.Model.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
    ((OutputView) outputView).outputRunTitle();
    int attemptTimes = raceRepository.getAttemptTimes();
    List<Car> carList = raceRepository.getCar();
    IntStream.range(0, attemptTimes).forEach(i -> {
      Map<String, Integer> raceState = carList.stream()
          .peek(Car::move)
          .collect(Collectors.toMap(Car::getName, Car::getPosition));
      ((OutputView) outputView).outputRunState(raceState);
      raceRepository.saveRaceState(raceState);
    });
  }
}
