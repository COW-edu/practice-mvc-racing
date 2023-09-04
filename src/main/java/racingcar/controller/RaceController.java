package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarFactory;
import racingcar.domain.racing.RacingGameManager;
import racingcar.utils.message.GuideMessage;
import racingcar.view.input.Input;
import racingcar.view.output.Output;

public class RaceController {

  private final Input input;
  private final Output output;
  private final RacingGameManager racingGameManager;
  private static final String SEPARATOR = " : ";
  private static final String NEW_LINE = "\n";

  public RaceController(Input input, Output output,
      RacingGameManager racingGameManager) {
    this.input = input;
    this.output = output;
    this.racingGameManager = racingGameManager;
  }

  public void runRacingGame() {
    try {
      List<Car> cars = promptForCarNames();
      int attemptCount = promptForAttemptCount();
      promptForRacingGame(cars, attemptCount);
      List<String> winningCarNames = promptForProcessingResult(cars);
      promptForPrintingResult(winningCarNames);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private List<Car> promptForCarNames() throws IllegalArgumentException {
    output.printGuideMessage(GuideMessage.INPUT_CAR_NAME);
    List<String> carNames = input.inputCarName();
    return CarFactory.produceCar(carNames);
  }

  private int promptForAttemptCount() {
    output.printGuideMessage(GuideMessage.INPUT_ATTEMPT_COUNT);
    return input.inputAttemptCount();
  }

  private void promptForRacingGame(List<Car> cars, int attemptCount) {
    output.printGuideMessage(GuideMessage.RESULT_PRINTING);
    startRace(cars, attemptCount);
  }

  private void startRace(List<Car> cars, int attemptCount) {
    IntStream.range(0, attemptCount).forEach(index -> {
      racingGameManager.race(cars);
      printRaceResult(cars);
      output.printRaceStatus(NEW_LINE);
    });
  }

  private void printRaceResult(List<Car> cars) {
    cars.forEach(car -> {
      output.printRaceStatus(car.getName() + SEPARATOR);
      printDistance(car);
      output.printRaceStatus(NEW_LINE);
    });
  }

  private void printDistance(Car car) {
    int count = car.getPosition();
    IntStream.range(0, count).forEach(index -> output.printRaceStatus("-"));
  }

  private List<String> promptForProcessingResult(List<Car> cars) {
    List<Car> winningCars = racingGameManager.getRaceResult(cars);
    return convertToStr(winningCars);
  }

  private List<String> convertToStr(List<Car> cars) {
    return cars.stream().map(Car::getName).collect(Collectors.toList());
  }

  private void promptForPrintingResult(List<String> strCars) {
    output.printResult(strCars);
  }
}
