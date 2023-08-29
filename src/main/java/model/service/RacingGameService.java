package model.service;

import java.util.StringTokenizer;
import model.domain.Car;
import model.repository.RacingGameRepository;

public class RacingGameService {

  private final RacingGameRepository racingGameRepository = new RacingGameRepository();

  public void register(StringTokenizer requestRegisterCars) {
    while (requestRegisterCars.hasMoreTokens()) {
      racingGameRepository.getRacingCars().add(new Car(requestRegisterCars.nextToken()));
    }
  }
}
