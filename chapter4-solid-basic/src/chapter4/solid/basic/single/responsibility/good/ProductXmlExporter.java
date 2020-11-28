package chapter4.solid.basic.single.responsibility.good;

public class ProductXmlExporter <T extends Product> implements ProductDataExporter<T> {

	@Override
	public String export(T product) {
		
		String name = product.getName();
		double price = product.getPrice();
		
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
