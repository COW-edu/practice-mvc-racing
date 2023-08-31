package racing.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Car {

  private final String name;
  private int position = 0;
  private final int START_RANDOM_NUMBER = 0;
  private final int FINISH_RANDOM_NUMBER = 9;
  private final int CHECK_NUMBER = 4;
  private final String MOVE_FORWARD_CHECKPOINT = "-";


  public Car(String name) {
    this.name = name;
  }

  // 추가 기능 구현

  public static Car createCar(String name) {
    return new Car(name);
  }

  public void moveForward() {
    if (Randoms.pickNumberInRange(START_RANDOM_NUMBER, FINISH_RANDOM_NUMBER) >= CHECK_NUMBER) {
      position++;
    }
  }

  public StringBuilder raceResult() {
    StringBuilder racingResult = new StringBuilder(this.name + " : ");
    racingResult.append(IntStream.range(0, position)
        .mapToObj(i -> MOVE_FORWARD_CHECKPOINT)
        .collect(Collectors.joining()));
    return racingResult;
  }

  public String getName() {
    return this.name;
  }

  public int getPosition() {
    return position;
  }
}
