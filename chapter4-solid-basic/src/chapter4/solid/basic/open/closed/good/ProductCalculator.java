package chapter4.solid.basic.open.closed.good;

import java.util.List;

import chapter4.solid.basic.single.responsibility.good.Product;

public interface ProductCalculator {

	double calculate(List<Product> products);
}
