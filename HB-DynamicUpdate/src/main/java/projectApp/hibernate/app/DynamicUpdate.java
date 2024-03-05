package projectApp.hibernate.app;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import projectApp.hibernate.model.Employee;
import projectApp.hibernate.util.HibernateUtil;

public class DynamicUpdate {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				Employee employee = session.get(Employee.class,12);
				transaction = session.beginTransaction();
			if(transaction!=null) {
				employee.seteName("Sumanta");
//				session.persist(employee);
				flag = true;
			}
			

			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(flag==true) {
					transaction.commit();
					System.out.println("Persistence Operation Succeed");
				}else {
					transaction.rollback();
					System.out.println("Persistence Operation Failed");
				}
				if (session != null) {
					HibernateUtil.closeSession(session);
					HibernateUtil.closeSessionFactory();
				}
			} catch (HibernateException he) {
				he.printStackTrace();
			}
		}
	}
}
