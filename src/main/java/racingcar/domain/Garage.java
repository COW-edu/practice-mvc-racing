package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.car.Car;

public class Garage {

  private final List<Car> garage;

  public Garage(List<Car> cars) {
    this.garage = cars;
  }

  public List<String> getStrGarage() {
    return convertToStrCarName();
  }

  private List<String> convertToStrCarName() {
    return this.garage.stream()
        .map(Car::getName)
        .collect(Collectors.toList());
  }
}
