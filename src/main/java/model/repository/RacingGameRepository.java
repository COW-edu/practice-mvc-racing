package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.domain.Car;

public class RacingGameRepository {
  private final List<Car> racingCars = new ArrayList<>();
  private final List<String> racingProcess = new ArrayList<>();

  public List<Car> getRacingCars() {
    return racingCars;
  }

  public List<String> getRacingProcess() {
    return racingProcess;
  }
}
