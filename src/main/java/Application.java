import controller.RaceController;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        RaceConfig raceConfig = new RaceConfig();
        RaceController raceController = raceConfig.raceController();
        raceController.run();
    }
}
