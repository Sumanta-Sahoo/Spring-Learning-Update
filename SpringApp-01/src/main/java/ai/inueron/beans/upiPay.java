package ai.inueron.beans;

public class upiPay implements IPay {

	public upiPay() {
		System.out.println("upiPay Created");
	}

	public void paymentMethod() {
		// TODO Auto-generated method stub
		System.out.println("upiPay selected");
	}
	public boolean payBill(Double amt) {
		System.out.println("paying bill through upi");
		return true;
	}

}
