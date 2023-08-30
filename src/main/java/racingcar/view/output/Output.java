package racingcar.view.output;

import java.util.List;

public interface Output {
  void printGuideMessage(String message);
  void printRaceStatus(String status);
  void printResult(List<String> result);
}
