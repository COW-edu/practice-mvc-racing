package racingcar.common;

import java.util.Collections;
import java.util.List;

import racingcar.common.front.FrontController;
import racingcar.car.entity.Car;

public class GameManger {

	private final FrontController frontController;

	public GameManger(FrontController frontController) {
		this.frontController = frontController;
	}

	public void initGame(String initCars, int roundCount) {
		Request initCarsRequest = initCars(initCars);
		Request initRoundRequest = initRound(roundCount);
		frontController.service(initCarsRequest);
		frontController.service(initRoundRequest);
	}

	public int getRound() {
		Request request = new Request("getRound");
		ModelView modelView = frontController.service(request);
		return (int)modelView.getModel().get("roundCount");
	}

	public void roundStart() {
		Request request = new Request("roundStart");
		frontController.service(request);
	}

	public List<Car> getCars() {
		Request request = new Request("getCars");
		ModelView modelView = frontController.service(request);
		return Collections.unmodifiableList((List<Car>)modelView.getModel().get("cars"));
	}

	public void insertWinner() {
		Request request = new Request("insertWinner");
		request.setParams("cars", getCars());
		frontController.service(request);
	}

	public String showWinnerSheet() {
		Request request = new Request("showWinnerSheet");
		ModelView modelView = frontController.service(request);
		return (String)modelView.getModel().get("winnerSheet");
	}

	private Request initCars(String initCars) {
		Request request = new Request("initCars");
		request.setParams("initCars", initCars);
		return request;
	}

	private Request initRound(int roundCount) {
		Request request = new Request("initRound");
		request.setParams("roundCount", roundCount);
		return request;
	}
}
