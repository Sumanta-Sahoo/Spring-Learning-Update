package com.hb.Utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.Entity.Student;

public class HibernateUtil {

	private HibernateUtil() {
	}

	public static SessionFactory factory = null;
	public static Session session = null;

	static {
		factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}

	public static Session getSession() {
		if (factory != null)
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
