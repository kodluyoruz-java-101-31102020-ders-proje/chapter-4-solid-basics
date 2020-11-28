package chapter4.solid.basic.interface_segregation.bad;

public interface ShoppingCard {

	public double loadMoney(double value);
	public double withDrawMoney(double value);
	public double makeOnlineShopping(double value);
	public double makeMarketShopping(double value);
}
