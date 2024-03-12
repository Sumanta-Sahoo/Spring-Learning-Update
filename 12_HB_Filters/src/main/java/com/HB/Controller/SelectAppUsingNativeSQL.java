package com.HB.Controller;

import java.util.List;

import org.hibernate.Filter;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.HB.Entity.BankAccount;
import com.HB.Util.HibernateUtil;


public class SelectAppUsingNativeSQL {

	public static void main(String[] args) {

		Session session = null;
		
		try {
			if(session==null)
				session = HibernateUtil.getSession();
			
			Filter filter = session.enableFilter("FILTER_BANK_ACCOUT_STATUS");
			filter.setParameter("accType1", "Self");
			
			Query<BankAccount> query = session.createQuery("FROM com.HB.Entity.BankAccount where accBalance<=:amt");
			query.setParameter("amt", 10000.00);
			
			List<BankAccount> list1 = query.list();
			list1.forEach(System.out::println);
			
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
