package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.View.Util.StringParser;

public class InputView implements ViewInterface {
  public static List<String> InputCarName() {
    System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    return StringParser.ParseCarName(Console.readLine());
  }
}
