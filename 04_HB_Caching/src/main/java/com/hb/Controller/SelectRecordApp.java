package com.hb.Controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.Entity.Student;
import com.hb.Utils.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {

		Session session = null;
		Student std1 = null;
		Student std2 = null;
		Student std3 = null;
		
		try {
			if(session==null) {
				session = HibernateUtil.getSession();
			}
			std1 = session.get(Student.class, 2);
			System.out.println("1 : " + std1);
			System.out.println("------------------------------------------");
			
			session.evict(std1);
//			Thread.sleep(20000);
//			System.out.println("After sleep for 20 sec");
			std2 = session.get(Student.class, 2);
			System.out.println("2 : " + std2);
			System.out.println("------------------------------------------");
			std2 = session.get(Student.class, 2);
			System.out.println("2 : " + std2);
			System.out.println("------------------------------------------");
			
			session.clear();
			
			System.out.println("std2 in l1 ::"+ session.contains(std2));
			
			std2 = session.get(Student.class, 2);
			System.out.println("2 : " + std2);
			System.out.println("------------------------------------------");
			session.evict(std2);
			
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
