package ai.inueron.beans;

public class creditCard implements IPay {
	
	public creditCard() {
		System.out.println("Credit Card Created");
	}

	public void paymentMethod() {
		// TODO Auto-generated method stub
		System.out.println("credit selected");
	}

	public boolean payBill(Double amt) {
		System.out.println("paying bill through credit");
		return true;
	}
}
