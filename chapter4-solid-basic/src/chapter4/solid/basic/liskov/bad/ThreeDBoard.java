package chapter4.solid.basic.liskov.bad;

import java.util.HashSet;
import java.util.Set;

public class ThreeDBoard implements Board{

	private Set<ThreeDPoint> points;
	
	public ThreeDBoard() {
		this.points = new HashSet<ThreeDPoint>();
	}
	
	@Override
	public void addPoint(int x, int y) {
		throw new RuntimeException("You can not add 2D point to 3D board");
	}

	@Override
	public Point removePoint(int x, int y) {
		throw new RuntimeException("You can not add 2D point to 3D board");
	}

	@Override
	public void addPoint(int x, int y, int z) throws Exception {
		
		this.points.add(new ThreeDPoint(x, y, z));
	}

	@Override
	public Point removePoint(int x, int y, int z) throws Exception {

		ThreeDPoint p = new ThreeDPoint(x, y, z);
		if(this.points.remove(p)) {
			return p;
		}
		
		return null;
	}

}
