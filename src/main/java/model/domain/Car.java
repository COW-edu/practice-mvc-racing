package model.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void moveFoward() {
        if(Randoms.pickNumberInRange(0,9)>=4) {
            position++;
        }
    }

    public StringBuilder raceResult(){
        StringBuilder racingResult = new StringBuilder(this.name+" : ");
        for(int i=0; i<position; i++){
            racingResult.append("-");
        }

        return racingResult;
    }
    public void prinntName(){
        System.out.println(this.name);
    }
}
