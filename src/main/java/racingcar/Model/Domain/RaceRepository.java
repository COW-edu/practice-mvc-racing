package racingcar.Model.Domain;

import java.util.ArrayList;
import java.util.List;

public class RaceRepository {
  private static RaceRepository instance = null;

  private List<Car> carList = new ArrayList<>();
  private int carNumber = 0;

  private int attemptTimes;

  private RaceRepository() {}

  public static RaceRepository getInstance() {
    if (instance == null)
      instance = new RaceRepository();
    return instance;
  }

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

  public int getCarNumber() {
    return carNumber;
  }

  public void setAttemptTimes(int attemptTimes) {
    this.attemptTimes = attemptTimes;
  }
}
