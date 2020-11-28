package chapter4.solid.basic.single.responsibility.good;

public class ProductJsonExporter <T extends Product> implements ProductDataExporter<T>{

	@Override
	public String export(T product) {
		
		String name = product.getName();
		double price = product.getPrice();
		
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

}
