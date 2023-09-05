package racingcar.common.front.adapter;

import racingcar.common.ModelView;
import racingcar.common.Request;

public interface MyHandlerAdapter {

	boolean supports(Object handler);

	ModelView handle(Request request, Object handler);
}
