package ai.merit.HB.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ai.merit.HB.model.HBStudnet;

public class HibernateUtil {
	public static SessionFactory sessionFactory = null;
	public static Session session = null;
	
	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(HBStudnet.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		if(session==null) {
			session = sessionFactory.openSession();
		}
		return session;
	}
	
	public static void closeSession(Session session) {
		
		try {
			if(session!=null) {
				session.close();
			}
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
	
	public static void closeSessionFactory() {
		try {
			if(sessionFactory!=null) {
				sessionFactory.close();
			}
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
	
	
}
