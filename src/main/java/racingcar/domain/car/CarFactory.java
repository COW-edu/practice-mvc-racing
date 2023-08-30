package racingcar.domain.car;

import java.util.List;
import racingcar.domain.car.Car;

public interface CarFactory {
  List<Car> produceCar(List<String> carList);
}
