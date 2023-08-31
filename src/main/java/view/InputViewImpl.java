package view;

import camp.nextstep.edu.missionutils.Console;
import java.util.StringTokenizer;
import message.RequestMessage;

public class InputViewImpl implements InputView {

  @Override
  public StringTokenizer inputCar() {
    System.out.println(RequestMessage.REQUEST_CARS);
    return new StringTokenizer(Console.readLine(), RequestMessage.CARS_SEPARATOR);
  }

  @Override
  public int inputRound() {
    System.out.println(RequestMessage.REQUEST_ROUND);
    return Integer.parseInt(Console.readLine());
  }
}
