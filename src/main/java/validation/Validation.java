package validation;

import java.util.List;
import message.ErrorMessage;

public class Validation {

  private final int CHARACTER_LIMIT =5;

  public void validateCharacterCount(List<String> cars) throws IllegalArgumentException {
    cars.forEach(this::validateCount);

  }

  public void validateInteger(String inputs) {
    String regex = "^[0-9]*$";
    if (!inputs.matches(regex)) {
      throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER);
    }
  }

  private void validateCount(String carName) {
    if (carName.toCharArray().length > CHARACTER_LIMIT) {
      throw new IllegalArgumentException(ErrorMessage.OVER_CHARACTER_COUNT);
    }
  }



}
