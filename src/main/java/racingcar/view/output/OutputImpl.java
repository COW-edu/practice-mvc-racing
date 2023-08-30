package racingcar.view.output;

import java.util.List;

public class OutputImpl implements Output{

  @Override
  public void printGuideMessage(String message) {
    System.out.println(message);
  }

  @Override
  public void printRaceStatus(String status) {
    System.out.print(status);
  }


  @Override
  public void printResult(List<String> result) {
    System.out.println("최종 우승자 : " + String.join(", ", result));
  }
}
