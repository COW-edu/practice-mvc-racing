package racingcar.Model.Domain;

드import racingcar.Model.Service.RandomNumberGenerator;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int randomNumber = RandomNumberGenerator.generateRandomNumber();
        if (randomNumber >= 4)
            position += 1;
    }
}
