package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.domain.Car;

public class RacingGameRepository {
  private final List<Car> racingCars = new ArrayList<>();

  public List<Car> getRacingCars() {
    return racingCars;
  }
}
