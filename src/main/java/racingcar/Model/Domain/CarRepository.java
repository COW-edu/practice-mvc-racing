package racingcar.Model.Domain;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
  private static CarRepository instance = null;

  private List<Car> carList = new ArrayList<>();
  private int carNumber = 0;

  private CarRepository() {}

  public static CarRepository getInstance() {
    if (instance == null)
      instance = new CarRepository();
    return instance;
  }

  public void addCar(Car car) {
    carList.add(car);
    carNumber += 1;
  }

  public Car getCar(int index) {
    return carList.get(index);
  }

  public int getCarNumber() {
    return carNumber;
  }
}
