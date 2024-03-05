package ai.inueron.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PaymentProcess paymentProcess = context.getBean("paymentprocess", PaymentProcess.class);
		paymentProcess.doPayment(100.55);
	}

}
