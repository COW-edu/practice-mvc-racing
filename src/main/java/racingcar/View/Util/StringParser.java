package racingcar.View.Util;

import java.util.Arrays;
import java.util.List;

public class StringParser {

  public static List<String> ParseCarName(String CarNameString) {
    return Arrays.asList(CarNameString.split(","));
  }
}
