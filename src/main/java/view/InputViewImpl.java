package view;

import camp.nextstep.edu.missionutils.Console;
import java.util.StringTokenizer;

public class InputViewImpl implements InputView{

  @Override
  public StringTokenizer inputCar() {
    return new StringTokenizer(Console.readLine());
  }

  @Override
  public int inputRound() {
    return Integer.parseInt(Console.readLine());
  }
}
