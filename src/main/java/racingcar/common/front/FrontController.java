package racingcar.common.front;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import racingcar.car.controller.CarJoinController;
import racingcar.car.controller.CarSetPositionController;
import racingcar.car.controller.CarsGetController;
import racingcar.common.ModelView;
import racingcar.common.Request;
import racingcar.common.front.adapter.CarControllerAdapter;
import racingcar.common.front.adapter.GameControllerAdapter;
import racingcar.common.front.adapter.MyHandlerAdapter;
import racingcar.game.controller.GameGetRoundController;
import racingcar.game.controller.GameGetWinnerSheetController;
import racingcar.game.controller.GameInsertWinnerController;
import racingcar.game.controller.GameSetRoundController;

public class FrontController {

	private final Map<String, Object> handlerMappingMap = new HashMap<>();
	private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();

	public FrontController () {
		initHandlerMappingMap();
		initHandlerAdapters();
	}

	public ModelView service(Request request) {
		Object handler = getHandler(request.getRequestName());

		MyHandlerAdapter adapter = getHandlerAdapter(handler);
		ModelView modelView = adapter.handle(request, handler);

		return modelView;
	}

	private void initHandlerMappingMap() {
		handlerMappingMap.put("initCars", new CarJoinController());
		handlerMappingMap.put("roundStart", new CarSetPositionController());
		handlerMappingMap.put("getCars", new CarsGetController());

		handlerMappingMap.put("initRound", new GameSetRoundController());
		handlerMappingMap.put("getRound", new GameGetRoundController());
		handlerMappingMap.put("insertWinner", new GameInsertWinnerController());
		handlerMappingMap.put("showWinnerSheet", new GameGetWinnerSheetController());
	}

	private void initHandlerAdapters() {
		handlerAdapters.add(new CarControllerAdapter());
		handlerAdapters.add(new GameControllerAdapter());
	}

	private MyHandlerAdapter getHandlerAdapter(Object handler) {
		/**
		 * 인덴테이션 조건 맞추기
		 */
		for (MyHandlerAdapter adapter : handlerAdapters) {
			if (adapter.supports(handler)) {
				return adapter;
			}
		}
		throw new IllegalArgumentException("handler adapter를 찾을 수 없습니다. handler = " + handler);
	}

	private Object getHandler(String request) {
		return handlerMappingMap.get(request);
	}
}
