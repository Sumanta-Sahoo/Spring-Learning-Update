package com.hb.Controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.Entity.Student;
import com.hb.Utils.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) throws Exception{

		Session session = null;
		Student std1 = null;
		Student std2 = null;
		Student std3 = null;
		
		try {
			session = HibernateUtil.getSession();
			std1 = session.get(Student.class, 2);
			System.out.println("1 : " + std1);
			System.out.println("------------------------------------------");
			session.evict(std1);
			
			std1 = session.get(Student.class, 2);
			System.out.println("1 : " + std1);
			System.out.println("------------------------------------------");
			
		}catch(HibernateException hbe) {
			hbe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
