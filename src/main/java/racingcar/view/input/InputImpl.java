package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.utils.message.ErrorMessage;

public class InputImpl implements Input {

  private final static int LIMITED_LENGTH = 5;
  private final static String CAR_SEPARATOR = ",";
  @Override
  public List<String> inputCarName() throws IllegalArgumentException {
    List<String> names = new ArrayList<>(List.of(Console.readLine().split(CAR_SEPARATOR)));
    names.forEach(this::validateName);
    return names;
  }

  @Override
  public int inputAttemptCount() {
    String attemptCount = Console.readLine();
    validateNumeric(attemptCount);
    return Integer.parseInt(attemptCount);
  }

  private void validateNumeric(String number) throws IllegalArgumentException {
    try {
      Integer.parseInt(number);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(ErrorMessage.IS_NOT_NUMERIC);
    }
  }

  private void validateName(String name) {
    if (name.length() > LIMITED_LENGTH) {
      throw new IllegalArgumentException(ErrorMessage.IS_TOO_LONG_NAME);
    }
  }
}
