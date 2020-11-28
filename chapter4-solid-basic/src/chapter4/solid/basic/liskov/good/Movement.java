package chapter4.solid.basic.liskov.good;

import java.util.HashMap;
import java.util.Map;

public class Movement <T extends Number> {

	private Map<String, T> multiDimensionPoint;
	
	public Movement() {
		this.multiDimensionPoint = new HashMap<String, T>();
	}
	
	public void addMovementDimension(String dimensionName, T dimensionValue) {
		this.multiDimensionPoint.put(dimensionName, dimensionValue);
	}
	
	public void setMovement(Map<String, T> movement) {
		this.multiDimensionPoint.putAll(movement);
	}
	
	public Map<String, T> getMovement() {
		return this.multiDimensionPoint;
	}

	
	@Override
	public String toString() {
		return "Movement [multiDimensionPoint=" + multiDimensionPoint + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((multiDimensionPoint == null) ? 0 : multiDimensionPoint.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movement other = (Movement) obj;
		if (multiDimensionPoint == null) {
			if (other.multiDimensionPoint != null)
				return false;
		} else if (!multiDimensionPoint.equals(other.multiDimensionPoint))
			return false;
		return true;
	}
	
}
