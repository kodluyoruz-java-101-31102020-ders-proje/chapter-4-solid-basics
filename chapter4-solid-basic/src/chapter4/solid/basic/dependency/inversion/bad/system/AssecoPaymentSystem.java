package chapter4.solid.basic.dependency.inversion.bad.system;

public class AssecoPaymentSystem extends PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {

		return false;
	}

	@Override
	public int charge(double totalPrice) {
		
		System.out.println("Asseco system charged ==> " + totalPrice);
		
		int chargeID = (int)Math.random() * 10000;
		
		super.addChargeToPreviousPayments(chargeID, totalPrice);
		
		return chargeID;
	}

	@Override
	public String loadInvoice(int chargeId) {
		
		// geçmiş ödemelerden ödeme ID'si ile ödemeyi buluyoruz.
		double previousPaymentInvoice = super.getChargeFromPreviousPayments(chargeId);
		
		// String'e çeviriyoruz.
		return String.valueOf(previousPaymentInvoice);
	}

}
