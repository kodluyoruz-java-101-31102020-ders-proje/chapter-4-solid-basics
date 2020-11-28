package chapter4.solid.basic.open.closed.bad;

import java.util.List;

import chapter4.solid.basic.single.responsibility.good.Product;
import chapter4.solid.basic.single.responsibility.good.Tax;

//Bad design! You violate Open/Closed Principle here!
public class ProductCalculations {

	public double calculatePriceOfProducts(List<Product> products) {
		
		double totalPrice = 0;
		
		for(Product product : products) {
			
			totalPrice += product.getPrice();
		}
		
		return totalPrice;
	}
	
	public double calculate(List<Product> products, List<Tax> taxes) {
		
		double totalTaxValue = 0;
		
		for(Product product : products) {
			
			double taxForProduct = 0;
			
			for(Tax tax : taxes) {
				taxForProduct += product.getPrice() * tax.getRatio();
			}
			
			totalTaxValue += taxForProduct;
		}
		
		return totalTaxValue;
	}
	
	public double calculateDiscount(List<Product> products) {
		
		return 0.0;
	}
	
}
