package racingcar.domain.car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarFactoryImpl implements CarFactory {

  @Override
  public List<Car> produceCar(List<String> carNames) {
    return carNames.stream()
        .map(Car::new)
        .collect(Collectors.toList());
  }
}
