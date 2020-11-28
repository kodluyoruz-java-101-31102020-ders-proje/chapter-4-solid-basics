package chapter4.solid.basic.liskov.good;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Board<Double> twoDBoard = new TwoDBoard<Double>(2);
		Board<Integer> threeDBoard = new ThreeDBoard<Integer>(3);

		Movement<Double> movement1 = new Movement<Double>();
		movement1.addMovementDimension("x", 5.0);
		movement1.addMovementDimension("y", 15.0);
		twoDBoard.addMovement(movement1);
		
		Movement<Double> movement2 = new Movement<Double>();
		movement2.addMovementDimension("x", 25.0);
		movement2.addMovementDimension("y", 56.0);
		twoDBoard.addMovement(movement2);
		
		printBoardMovements(twoDBoard);
		
		
		
		Movement<Integer> movement3 = new Movement<Integer>();
		movement3.addMovementDimension("x", 5);
		movement3.addMovementDimension("y", 15);
		movement3.addMovementDimension("z", 50);
		threeDBoard.addMovement(movement3);
		
		Movement<Integer> movement4 = new Movement<Integer>();
		movement4.addMovementDimension("x", 50);
		movement4.addMovementDimension("y", 35);
		movement4.addMovementDimension("z", 90);
		threeDBoard.addMovement(movement4);
		
		printBoardMovements(threeDBoard);
	}
	
	private static <T extends Number> void printBoardMovements(Board<T> board) {
		
		for(Movement<T> movement : board.getAllMovements()) {
			
			System.out.println(movement);
		}
	}

}
