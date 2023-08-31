package racing.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingGame {

  private final List<Car> registeredRacingCars = new ArrayList<>();

  public void addRacingCars(StringTokenizer requestRegisteredRacingCars){
    while (requestRegisteredRacingCars.hasMoreTokens()) {
      registeredRacingCars.add(Car.createCar(requestRegisteredRacingCars.nextToken()));
    }
  }

  public String oneGameResult() {
    StringBuilder oneGameResult = new StringBuilder();
    registeredRacingCars.stream()
        .forEach(car -> car.moveForward());
    registeredRacingCars.stream()
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
