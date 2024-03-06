package com.HB.Controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HB.Entity.BankAccount;
import com.HB.Util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) {
		
		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;
		
		try {
			if(session == null) {
				session = HibernateUtil.getSession();
			}
			if(session!=null) {
				transaction = session.beginTransaction();
				if(transaction!=null) {
					BankAccount bankAccount = new BankAccount();
					bankAccount.setAccHolderName("Sumanta Sahoo");
					bankAccount.setAccBalance(3000.12);
					bankAccount.setAccType("Saving");
					
					session.persist(bankAccount);
					flag = true;
				}
			}
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(flag) {
				transaction.commit();
				System.out.println("Persistence Operation Succed");
			}else {
				transaction.rollback();
				System.out.println("Persistence Operation Failed");
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
