package chapter4.solid.basic.single.responsibility.good;

public class Tax {

	private String name;
	private double ratio;
	
	public Tax(String name, double ratio) {
		this.name = name;
		this.ratio = ratio;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRatio() {
		return ratio;
	}
	
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
}
