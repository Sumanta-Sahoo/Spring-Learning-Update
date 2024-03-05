package com.hb.Controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.Entity.Student;
import com.hb.Utils.HibernateUtil;

public class InsertRecordApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction tarnsaction = null;
		Boolean flag = false;
		
		try {
			if(session == null) {
				session = HibernateUtil.getSession();
				if(session!=null) {
					tarnsaction =session.beginTransaction();
				}
			}
			if(tarnsaction!=null) {
				Student std = new Student();
				std.setStdName("Pritam");
				std.setStdAddr("BER");
				std.setStdContact("5486972145");
				std.setStdRegNo("BB0108");
				
				session.persist(std);
				flag = true;
			}
		}catch(HibernateException hbe) {
			hbe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				tarnsaction.commit();
				System.out.println("Persistence Operation Succed");
			}else {
				tarnsaction.rollback();
				System.out.println("Persistence Operation Failed");
			}
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
