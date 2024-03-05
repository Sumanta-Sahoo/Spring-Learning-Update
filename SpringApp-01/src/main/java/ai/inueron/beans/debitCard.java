package ai.inueron.beans;

public class debitCard implements IPay {
	public debitCard() {
		System.out.println("debitCard Created");
	}

	public void paymentMethod() {
		// TODO Auto-generated method stub
		System.out.println("debitCard selected");
	}
	
	public boolean payBill(Double amt) {
		System.out.println("paying bill through debit");
		return true;
	}

}
