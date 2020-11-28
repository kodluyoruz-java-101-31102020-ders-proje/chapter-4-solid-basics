package chapter4.solid.basic.liskov.bad;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Board twoDboard = new TwoDBoard(); 
		Board threeDboard = new ThreeDBoard(); 
		
		twoDboard.addPoint(11, 51);
		twoDboard.addPoint(1, 5, 10);
		twoDboard.removePoint(11, 51);

		threeDboard.addPoint(4, 2, 1);
		threeDboard.addPoint(1, 56);
	}

}
