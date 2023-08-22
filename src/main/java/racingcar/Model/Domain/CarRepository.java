package racingcar.Model.Domain;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
  private static CarRepository instance = null;

  private List<Car> carList = new ArrayList<>();

  private CarRepository() {}

  public static CarRepository getInstance() {
    if (instance == null)
      instance = new CarRepository();
    return instance;
  }
}
