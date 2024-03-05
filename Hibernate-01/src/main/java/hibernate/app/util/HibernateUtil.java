package hibernate.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.app.model.Student;



public class HibernateUtil {
	
	private static SessionFactory sessionFactory =null;
	private static Session session =null;
	
	
	// Private Constructor so that only one object is created at a time
	private HibernateUtil(){
	}
	
	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		if(session==null)
			session = sessionFactory.openSession();
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session!=null)
			session.close();
	}
	public static void closeSessionFactory() {
		if(sessionFactory!=null)
			sessionFactory.close();
	}
}
