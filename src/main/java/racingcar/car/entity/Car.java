package racingcar.car.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private static final int START_INCLUSIVE = 0;
	private static final int END_INCLUSIVE = 9;

	private final String name;
	private int position = 0;

	private static final int FORWARD_CONDITION = 4;

	public Car(String name) {
		this.name = name;
	}

	public void randomPosition() {
		int randomNumber = Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
		if (iForwardCondition(randomNumber)) {
			position += 1;
		}
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	private boolean iForwardCondition(int randomNumber) {
		return randomNumber >= FORWARD_CONDITION;
	}

}
