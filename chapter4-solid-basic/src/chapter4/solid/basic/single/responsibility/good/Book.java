package chapter4.solid.basic.single.responsibility.good;

public class Book implements Product {

	private String name;
	private double price;
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
