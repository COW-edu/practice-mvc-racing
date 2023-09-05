package racingcar.common;

import java.util.HashMap;
import java.util.Map;

public class ModelView {

	private final String modelName;
	private Map<String, Object> model = new HashMap<>();

	public ModelView(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(String objectName, Object object) {
		model.put(objectName, object);
	}
}
