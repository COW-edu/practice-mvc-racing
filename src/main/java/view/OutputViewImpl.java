package view;

import java.util.List;
import message.ResultMessage;

public class OutputViewImpl implements OutputView {

  @Override
  public void showRace(String raceProcess) {
    System.out.println(ResultMessage.RACING_RESULT_INSTRUCTION);
    System.out.println(raceProcess);
  }

  @Override
  public void showWinner(String winner) {
    System.out.println(ResultMessage.WINNER_INSTRUCTION+ winner);
  }
}
