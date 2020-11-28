package chapter4.solid.basic.interface_segregation.good;

public class BoynerGiftCard implements ShoppingCard {

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
}
