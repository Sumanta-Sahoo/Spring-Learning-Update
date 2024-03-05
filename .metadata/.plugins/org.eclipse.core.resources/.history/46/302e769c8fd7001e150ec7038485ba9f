package projectApp.hibernate.app;

import org.hibernate.HibernateException;

import org.hibernate.Session;

import projectApp.hibernate.model.Employee;
import projectApp.hibernate.util.HibernateUtil;

public class GetApp {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			if(session!=null) {
				Employee employee = session.get(Employee.class, 1);
				if(employee!=null)
					System.out.println(employee.geteName());
				else
					System.out.println("Record not found");
				
			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
