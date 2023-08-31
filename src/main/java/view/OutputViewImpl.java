package view;

import java.util.List;

public class OutputViewImpl implements OutputView{

  @Override
  public void showRace(String raceProcess) {
    System.out.println("실행 결과");
    System.out.println(raceProcess);
  }

  @Override
  public void showWinner(String winner) {
    System.out.println("최종 우승자 : "+winner);
  }
}
