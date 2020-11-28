package chapter4.solid.basic.dependency.inversion.good;

public class DopingPaymentIntegrator implements PaymentIntegrator {

	private PaymentProvider paymentProvider;
	
	
	public DopingPaymentIntegrator(PaymentProvider paymentProvider) {
		this.paymentProvider = paymentProvider;
	}
	
	@Override
	public void makePayment(double totalPrice) {
		
		this.paymentProvider.charge(totalPrice);
	}
}
