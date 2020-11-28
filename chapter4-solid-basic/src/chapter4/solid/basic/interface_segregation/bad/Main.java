package chapter4.solid.basic.interface_segregation.bad;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCard creditCard = new CreditCard();
		ShoppingCard sodexoCard = new SodexoCard();
		ShoppingCard giftCard = new BoynerGiftCard();
		
		creditCard.loadMoney(100000);
		sodexoCard.loadMoney(750);
		giftCard.loadMoney(1000);
		
		creditCard.makeMarketShopping(100);
		creditCard.makeOnlineShopping(200);
		creditCard.withDrawMoney(100);
		
		sodexoCard.makeMarketShopping(100);
		sodexoCard.withDrawMoney(40);
		// Boom! Bad sowftware design!
		// sodexoCard.makeOnlineShopping(100);
		
		giftCard.withDrawMoney(100);
		// Boom! Bad software design!
		// giftCard.makeMarketShopping(100);
		// giftCard.makeOnlineShopping(200);
	}

}
