package chapter4.solid.basic.interface_segregation.bad;

public class SodexoCard implements ShoppingCard {

	private double currentMoneyValue = 0;
	
	@Override
	public double loadMoney(double value) {
		this.currentMoneyValue += value;
		return this.currentMoneyValue;
	}

	@Override
	public double withDrawMoney(double value) {
		this.currentMoneyValue -= value;
		return this.currentMoneyValue;
	}

	@Override
	public double makeOnlineShopping(double value) {
		throw new RuntimeException("You can not make online shopping with this card!");
	}

	@Override
	public double makeMarketShopping(double value) {
		this.currentMoneyValue -= value;
		return this.currentMoneyValue;
	}
}
