package racingcar.domain.car;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.car.Car;

public class CarFactory {

  public static List<Car> createCar(List<String> carNames) {
    return carNames.stream().map(Car::new).collect(Collectors.toList());
  }
}
