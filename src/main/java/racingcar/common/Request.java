package racingcar.common;

import java.util.HashMap;
import java.util.Map;

public class Request {
	private final String requestName;
	private final Map<String, Object> params = new HashMap<>();

	public Request(String requestName) {
		this.requestName = requestName;
	}

	public String getRequestName() {
		return requestName;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(String paramName, Object param) {
		params.put(paramName, param);
	}
}
