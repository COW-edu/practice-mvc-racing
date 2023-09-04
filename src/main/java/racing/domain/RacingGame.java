package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class RacingGame {

  private final List<Car> registeredRacingCars = new ArrayList<>();

  public void addRacingCars(List<String> requestRegisteredRacingCars) {
    requestRegisteredRacingCars
        .forEach(car -> registeredRacingCars.add(Car.createCar(car)));
  }

  public String oneGameResult() {
    StringBuilder oneGameResult = new StringBuilder();
    registeredRacingCars
        .forEach(Car::moveForward);
    registeredRacingCars
        .forEach(car -> oneGameResult.append(car.raceResult()).append("\n"));

    return String.valueOf(oneGameResult);
  }

  public String getWinner() {
    List<Car> winner = checkWinner();
    return winner.stream()
        .map(Car::getName)
        .collect(Collectors.joining(","));
  }

  private List<Car> checkWinner() {
    return registeredRacingCars.stream()
        .filter(car -> car.getPosition() == registeredRacingCars.stream()
            .mapToInt(Car::getPosition)
            .max()
            .orElseThrow(NoSuchElementException::new))
        .collect(Collectors.toList());
  }
}
