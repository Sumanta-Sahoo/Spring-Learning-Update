package ai.merit.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ai.merit.model.Student;

public class HibernateUtil {

	private HibernateUtil() {}
	
	public static SessionFactory sessionFactory = null;
	public static Session session = null;
		
	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		if(session==null) {
			session = sessionFactory.openSession();
		}
		return session;
	}
	
	public static void closeSessionFatory() {
		if(sessionFactory!=null)
			sessionFactory.close();
	}
	public static void closeSession(Session session) {
		if(session!=null)
			session.close();
	}
}
