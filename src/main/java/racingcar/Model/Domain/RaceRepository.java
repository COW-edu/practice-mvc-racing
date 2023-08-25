package racingcar.Model.Domain;

import java.util.ArrayList;
import java.util.List;

public class RaceRepository {
  private List<Car> carList = new ArrayList<>();
  private int carNumber = 0;

  private int attemptTimes;

  public void addCar(Car car) {
    carList.add(car);
    carNumber += 1;
  }

  public void addCar(List<Car> carList) {
    this.carList.addAll(carList);
  }

  public Car getCar(int index) {
    return carList.get(index);
  }
  public List<Car> getCar() {
    return carList;
  }

  public int getCarNumber() {
    return carNumber;
  }

  public void saveAttemptTimes(int attemptTimes) {
    this.attemptTimes = attemptTimes;
  }

  public int getAttemptTimes() {
    return attemptTimes;
  }
}
