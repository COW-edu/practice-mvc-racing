package racingcar.Model.Util;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator {
  public static int generateRandomNumber() {
    return pickNumberInRange(0, 9);
  }
}
