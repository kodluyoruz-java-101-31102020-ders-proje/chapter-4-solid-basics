package chapter4.solid.basic.dependency.inversion.good;


public class ClassifiedPaymentIntegrator implements PaymentIntegrator {

	private PaymentProvider paymentProvider;
	
	public ClassifiedPaymentIntegrator(PaymentProvider paymentProvider) {
		
		this.paymentProvider = paymentProvider;
	}
	
	@Override
	public void makePayment(double totalPrice) {
		
		this.paymentProvider.charge(totalPrice);
	}
	
}
