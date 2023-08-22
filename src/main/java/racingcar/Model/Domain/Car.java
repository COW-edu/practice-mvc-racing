package racingcar.Model.Domain;

import racingcar.Model.Util.RandomNumberGenerator;

public class Car {
    private final String name;
    private int position = 0;

    private final int MOVE_CONDITION = 4;
    private final int MOVE_NUMBER = 1;

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
        if (randomNumber >= MOVE_CONDITION)
            position += MOVE_NUMBER;
    }
}
