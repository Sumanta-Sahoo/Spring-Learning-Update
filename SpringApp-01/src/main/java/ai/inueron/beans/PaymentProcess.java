package ai.inueron.beans;

public class PaymentProcess {

	private IPay selectPaymentProcess;
	
	public void setselectPaymentProcess(IPay selectPaymentProcess) {
		this.selectPaymentProcess = selectPaymentProcess;
	}
	
	public void doPayment(Double amt) {
		boolean paymentDone = selectPaymentProcess.payBill(555.564);
		if(paymentDone)
			System.out.println("Payment Success");
		else
			System.out.println("Failed");
	}
}
