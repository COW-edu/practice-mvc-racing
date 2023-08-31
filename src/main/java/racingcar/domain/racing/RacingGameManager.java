package racingcar.domain.racing;

import java.util.List;
import racingcar.domain.car.Car;

public interface RacingGameManager {

  void race(List<Car> cars);

  List<Car> getRaceResult(List<Car> cars);
}
