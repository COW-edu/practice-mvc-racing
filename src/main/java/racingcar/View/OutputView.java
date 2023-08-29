package racingcar.View;

import java.util.List;
import java.util.Map;

public class OutputView implements ViewInterface {

  public void outputRunTitle() {
    System.out.println("실행 결과");
  }

  public void outputRunState(Map<String, Integer> raceState) {
    for (Map.Entry<String, Integer> raceStatePair : raceState.entrySet()) {
      System.out.print(raceStatePair.getKey());
      System.out.print(" : ");
      for (int i = 0; i < raceStatePair.getValue(); i++) {
        System.out.print("-");
      }
      System.out.println();
    }
    System.out.println();
  }

  public void outputResult(List<String> winners) {
    System.out.print("최종 우승자 : ");
    if (winners.size() == 1) {
      System.out.println(winners.get(0));
      return;
    }
    String result = String.join(", ", winners);
    System.out.println(result);
  }

  @Override
  public void render() {

  }
}
