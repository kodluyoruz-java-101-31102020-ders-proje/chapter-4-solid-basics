package chapter4.solid.basic.open.closed.good;

import java.util.ArrayList;
import java.util.List;

import chapter4.solid.basic.single.responsibility.good.Product;
import chapter4.solid.basic.single.responsibility.good.Tax;

public class ProductTaxCalculator implements ProductCalculator {

	private List<Tax> taxes;
	
	public ProductTaxCalculator() {
		this.taxes = new ArrayList<Tax>();
	}
	
	public ProductTaxCalculator(List<Tax> taxes) {
		this.taxes = taxes;
	}
	
	@Override
	public double calculate(List<Product> products) {
		
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

}
