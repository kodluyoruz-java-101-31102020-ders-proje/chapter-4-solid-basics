package chapter4.solid.basic.dependency.inversion.bad.system;

public abstract class PaymentProvider {

	protected double[] previousPayments;

	protected PaymentProvider() {
		this.previousPayments = new double[10000];
	}
	
	public double[] getPreviousPayments() {
		return this.previousPayments;
	}
	
	public void setPreviousPayments(double[] previousPayments) {
		this.previousPayments = previousPayments;
	}
	
	public void addChargeToPreviousPayments(int chargeId, double totalPrice) {
		this.previousPayments[chargeId] = totalPrice;
	}
	
	public double getChargeFromPreviousPayments(int chargeId) {
		return this.previousPayments[chargeId];
	}
	
	public abstract boolean cancelCharge(int chargeId);
	
	public abstract int charge(double totalPrice);
	
	public abstract String loadInvoice(int chargeId);
	
}
