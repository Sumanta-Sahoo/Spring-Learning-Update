package com.HB.Controller;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HB.Entity.BankAccount;
import com.HB.Util.HibernateUtil;

public class UpadteApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		BankAccount obj = null;
		Boolean flag = false;
		Long id = 1L;

		try {
			if (session == null) {
				session = HibernateUtil.getSession();
			}
			if (session != null) {
				// get the object
				transaction = session.beginTransaction();
				obj = session.get(BankAccount.class, id);
				if (obj != null) {
					System.out.println("Object Before Update :: ");
					System.out.println(obj);
					obj.setAccBalance(obj.getAccBalance() - 1000);

					session.persist(obj);
					flag = true;
				} else {
					System.out.println("Record not found with id : " + id);
					System.exit(0);
				}
				// update if found
			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Persistence Updation Suceed");
			} else {
				transaction.rollback();
				System.out.println("Persistence Updation Suceed");
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
