package chapter4.solid.basic.liskov.good;

import java.util.HashSet;
import java.util.Set;

public class ThreeDBoard <T extends Number> implements Board<T>{

	private int dimension;
	private Set<Movement<T>> movements;
	
	public ThreeDBoard(int dimension) {
		this.dimension = dimension;
		this.movements = new HashSet<Movement<T>>();
	}
	
	@Override
	public void addMovement(Movement<T> movement) {
		
		if(this.dimension != movement.getMovement().size()) {
			throw new RuntimeException("Board dimension and Movement dimension is not same!");
		}
		
		this.movements.add(movement);
	}

	@Override
	public Movement<T> removeMovement(Movement<T> movement) {
		
		if(this.dimension != movement.getMovement().size()) {
			throw new RuntimeException("Board dimension and Movement dimension is not same!");
		}
		
		if(this.movements.remove(movement)) {
			return movement;
		}
		
		return null;
	}

	@Override
	public Set<Movement<T>> getAllMovements() {
		
		return this.movements;
	}

}
