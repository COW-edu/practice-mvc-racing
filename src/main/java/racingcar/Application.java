package racingcar;

import racingcar.Controller.FrontController;

public class Application {

  public static void main(String[] args) {
    RunConfig runConfig = new RunConfig();
    FrontController frontController = runConfig.runConfig();

    frontController.service("RaceSetting");
    frontController.service("RaceRun");
    frontController.service("RaceResult");
  }
}
