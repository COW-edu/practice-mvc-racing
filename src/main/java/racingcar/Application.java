package racingcar;

import racingcar.Controller.FrontController;

public class Application {
    public static void main(String[] args) {
        FrontController frontController = FrontController.getInstance();
        frontController.service("RaceSetting");
        frontController.service("RaceRun");
        frontController.service("RaceResult");
    }
}
