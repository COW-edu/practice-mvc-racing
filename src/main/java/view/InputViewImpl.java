package view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import message.RequestMessage;
import validation.Validation;

public class InputViewImpl implements InputView {

  private final Validation validation = new Validation();

  @Override
  public List<String> inputCar() throws IllegalArgumentException {
    System.out.println(RequestMessage.REQUEST_CARS);
    String inputCars = Console.readLine();
    List<String> cars = carNameSeparator(inputCars);
    validation.validateCharacterCount(cars);
    return cars;
  }

  @Override
  public int inputRound() throws IllegalArgumentException {
    System.out.println(RequestMessage.REQUEST_ROUND);
    String inputRound = Console.readLine();
    validation.validateInteger(inputRound);
    return Integer.parseInt(inputRound);
  }

  private List<String> carNameSeparator(String inputs) {
    StringTokenizer separator = new StringTokenizer(inputs, RequestMessage.CARS_SEPARATOR);
    List<String> inputContainer = new ArrayList<>();
    while (separator.hasMoreTokens()) {
      inputContainer.add(separator.nextToken());
    }
    return inputContainer;
  }
}
