import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.app.model.Student;

public class MyMainApp {

	public static void main(String[] args) {
		
//		1.Activate HIBERNATE
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
	
		
//		2.Create Persistence Object
		Student std = new Student();
		std.setsName("Suraj");
		std.setsID(2);
		std.setsAddr("BBSR");
		std.setsAge(25);

//		1.Perform persistence operation
		session.persist(std);
		transaction.commit();
		
	}

}
