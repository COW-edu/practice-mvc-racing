import frontcontroller.FrontController;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        RaceConfig raceConfig = new RaceConfig();
        FrontController frontController = raceConfig.frontController();
        frontController.run();
    }
}
