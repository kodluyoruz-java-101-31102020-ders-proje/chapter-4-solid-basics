package chapter4.solid.basic.open.closed.good;

import java.util.List;

import chapter4.solid.basic.single.responsibility.good.Product;

public class ProductPriceCalculator implements ProductCalculator {

	@Override
	public double calculate(List<Product> products) {
		
		double totalPrice = 0;
		
		for(Product product : products) {
			
			totalPrice += product.getPrice();
		}
		
		return totalPrice;
	}
	
}
