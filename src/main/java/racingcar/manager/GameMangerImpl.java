package racingcar.manager;

import java.util.Collections;
import java.util.List;

import racingcar.common.front.FrontController;
import racingcar.car.entity.Car;
import racingcar.common.ModelView;
import racingcar.common.Request;

public class GameMangerImpl implements GameManger {

	private final FrontController frontController;

	public GameMangerImpl(FrontController frontController) {
		this.frontController = frontController;
	}

	@Override
	public void initGame(String initCars, int roundCount) {
		Request initCarsRequest = initCars(initCars);
		Request initRoundRequest = initRound(roundCount);
		frontController.service(initCarsRequest);
		frontController.service(initRoundRequest);
	}

	@Override
	public int getRound() {
		Request request = new Request("getRound");
		ModelView modelView = frontController.service(request);
		return (int)modelView.getModel().get("roundCount");
	}

	@Override
	public void roundStart() {
		Request request = new Request("roundStart");
		frontController.service(request);

	}

	@Override
	public List<Car> getCars() {
		Request request = new Request("getCars");
		ModelView modelView = frontController.service(request);
		return  Collections.unmodifiableList((List<Car>)modelView.getModel().get("cars"));
	}

	@Override
	public void insertWinner() {
		Request request = new Request("insertWinner");
		request.setParams("cars", getCars());
		frontController.service(request);
	}

	@Override
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
