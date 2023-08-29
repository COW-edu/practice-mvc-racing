package car;

import java.util.List;
import java.util.stream.Collectors;

public class GameController {
    private List<Car> cars;

    public GameController(List<String> carNames) {
        this.cars = carNames.stream()
                            .map(Car::new)
                            .collect(Collectors.toList());
    }

    public void moveCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<String> getCarNames() {
        return cars.stream()
                    .map(Car::getName)
                    .collect(Collectors.toList());
    }

    public List<Integer> getCarPositions() {
        return cars.stream()
                    .map(Car::getPosition)
                    .collect(Collectors.toList());
    }

    public List<String> getWinners() {
        int maxPosition = cars.stream()
                              .mapToInt(Car::getPosition)
                              .max()
                              .orElse(0);

        return cars.stream()
                    .filter(car -> car.getPosition() == maxPosition)
                    .map(Car::getName)
                    .collect(Collectors.toList());
    }
}
