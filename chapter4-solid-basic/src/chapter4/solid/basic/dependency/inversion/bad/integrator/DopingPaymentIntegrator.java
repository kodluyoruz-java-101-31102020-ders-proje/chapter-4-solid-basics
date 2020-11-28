package chapter4.solid.basic.dependency.inversion.bad.integrator;

import chapter4.solid.basic.dependency.inversion.bad.system.AssecoPaymentSystem;

public class DopingPaymentIntegrator implements PaymentIntegrator {

	// Tightly coupled Dependecy!
	private AssecoPaymentSystem assecoPaymentSystem;
	
	
	public DopingPaymentIntegrator(AssecoPaymentSystem assecoPaymentSystem) {
		this.assecoPaymentSystem = assecoPaymentSystem;
	}
	
	@Override
	public void makePayment(double totalPrice) {
		
		this.assecoPaymentSystem.charge(totalPrice);
	}
}
