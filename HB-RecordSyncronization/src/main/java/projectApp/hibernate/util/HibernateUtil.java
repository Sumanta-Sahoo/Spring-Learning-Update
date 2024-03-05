package projectApp.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projectApp.hibernate.model.Employee;

public class HibernateUtil {
	
	private HibernateUtil() {}
	
	private static SessionFactory factory=null;
	private static Session session =null;
	
	static {
		factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		if(session == null)
			session = factory.openSession();
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session!=null)
			session.close();
	}
	public static void closeSessionFactory() {
		if(factory!=null)
			factory.close();
	}

}
