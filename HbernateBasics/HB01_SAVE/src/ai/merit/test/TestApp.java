package ai.merit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ai.merit.model.Student;

public class TestApp {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Student std = new Student();
		std.setId(1);
		std.setName("Sumanta");
		std.setAge(23);
		std.setCity("Banglore");
		
		session.save(std);
		transaction.commit();
		
		
		System.out.println("Object saved in DB");
	}

}
