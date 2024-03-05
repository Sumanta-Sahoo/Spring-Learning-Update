package ai.merit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ai.merit.model.Student;

public class TestApp {

	public static void main(String[] args) {
		
		// instruct the JVM about Hibernate
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session Session = sessionFactory.openSession();
		
		Transaction transaction = Session.beginTransaction();
		
//		create presistence object 
		Student std = new Student();
		std.setId(1);
		std.setName("Sumanta");
		std.setRegd("ABC12");
		
		Session.save(std);
		transaction.commit();

		System.out.println("Object saved to database");
	}

}
