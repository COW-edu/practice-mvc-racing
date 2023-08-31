package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RacingGame {

  private final List<Car> registeredracingCars = new ArrayList<>();

  public void addRacingCars(StringTokenizer requestRegisteredracingCars){
    while (requestRegisteredracingCars.hasMoreTokens()) {
      registeredracingCars.add(Car.createCar(requestRegisteredracingCars.nextToken()));
    }
  }

  public String oneGameResult() {
    StringBuilder oneGameResult = new StringBuilder();
    registeredracingCars.stream()
        .forEach(car -> car.moveForward());
    registeredracingCars.stream()
        .forEach(car -> oneGameResult.append(car.raceResult()).append("\n"));

    return String.valueOf(oneGameResult);
  }

}
