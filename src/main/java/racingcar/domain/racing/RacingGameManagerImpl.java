package racingcar.domain.racing;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import racingcar.domain.car.Car;

public class RacingGameManagerImpl implements RacingGameManager {

  private static final int CRITICAL_VALUE = 4;


  @Override
  public void race(List<Car> cars) {
    cars.forEach(car -> {
      int random = generateRandomValue();
      checkAndMoveForward(car, random);
    });
  }

  @Override
  public List<Car> getRaceResult(List<Car> cars) {
    int maxPosition = getMaxPosition(cars);
    List<Car> winningCar = processRaceResults(cars, maxPosition);
    return winningCar;
  }

  private void checkAndMoveForward(Car car, int random) {
    if (isForwardPossible(random)) {
      car.plusPosition();
    }
  }

  private int generateRandomValue() {
    return Randoms.pickNumberInRange(0, 9);
  }

  private boolean isForwardPossible(int number) {
    return number >= CRITICAL_VALUE;
  }

  private int getMaxPosition(List<Car> cars) {
    AtomicInteger maxPosition = new AtomicInteger();
    cars.forEach(car -> {
      int position = car.getPosition();
      maxPosition.set(Math.max(maxPosition.get(), position));
    });
    return maxPosition.get();
  }

  private Car getWinningCar(Car car, int maxPosition) {
    if (car.getPosition() == maxPosition) {
      return car;
    }
    return null;
  }

  private List<Car> processRaceResults(List<Car> cars, int maxPosition) {
    List<Car> winningCar = new ArrayList<>();
    cars.forEach(car -> {
      Car tempCar = getWinningCar(car, maxPosition);
      if (tempCar == null) {
        return;
      }
      winningCar.add(tempCar);
    });
    return winningCar;
  }
}
