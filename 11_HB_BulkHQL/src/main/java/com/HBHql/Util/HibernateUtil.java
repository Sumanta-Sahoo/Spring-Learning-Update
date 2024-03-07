package com.HBHql.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.HBHql.Entity.InsurancePolicy;

public class HibernateUtil {
	
	private HibernateUtil() {}
	
	public static SessionFactory factory = null;
	
	static {
		factory = new Configuration().configure().addAnnotatedClass(InsurancePolicy.class).buildSessionFactory();
	}
	
	public static Session getSession() {
			return factory.openSession();
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
