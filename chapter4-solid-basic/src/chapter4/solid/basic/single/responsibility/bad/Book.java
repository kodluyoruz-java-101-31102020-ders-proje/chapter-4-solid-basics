package chapter4.solid.basic.single.responsibility.bad;

// Bad design! You violate Single Responsibility Principle here!
public class Book {

	private String name;
	private double price;
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String exportAsJson() {
		
		String name = this.getName();
		double price = this.getPrice();
		
		StringBuilder builder = new StringBuilder();
		builder.append("{ product: ");
		builder.append(" {");
		builder.append("name: ");
		builder.append(name);
		builder.append(",");
		builder.append("price: ");
		builder.append(price);
		builder.append("  }");
		builder.append("}");
		
		return builder.toString();
	}
	
	public String exportAsXml() {
		
		String name = this.getName();
		double price = this.getPrice();
		
		StringBuilder builder = new StringBuilder();
		builder.append("<Product>");
		builder.append("<Name>");
		builder.append(name);
		builder.append("</Name>");
		builder.append("<Price>");
		builder.append(price);
		builder.append("</Price>");
		builder.append("</Product>");
		
		return builder.toString();
	}
	

}
