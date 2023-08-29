package racingcar.Model.Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceRepository {

  private List<Car> carList = new ArrayList<>();
  private int carNumber = 0;

  private int attemptTimes;
  private Map<String, Integer> raceState = new HashMap<>();

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

  public void saveRaceState(Map<String, Integer> raceState) {
    this.raceState = raceState;
  }

  public Map<String, Integer> getRaceState() {
    return raceState;
  }
}
