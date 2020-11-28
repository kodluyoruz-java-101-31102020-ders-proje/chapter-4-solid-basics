package chapter4.solid.basic.liskov.bad;

public class ThreeDPoint extends Point {

	private int z;
	
	public ThreeDPoint(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThreeDPoint other = (ThreeDPoint) obj;
		if (z != other.z)
			return false;
		return true;
	}
}
