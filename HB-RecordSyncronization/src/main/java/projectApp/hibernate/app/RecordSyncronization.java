package projectApp.hibernate.app;

import java.io.IOException;

import org.hibernate.HibernateException;

import org.hibernate.Session;

import projectApp.hibernate.model.Employee;
import projectApp.hibernate.util.HibernateUtil;

public class RecordSyncronization {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				Employee employee = session.get(Employee.class,1);
				System.out.println("Name Before Updation : " + employee.geteName());
				if(employee!=null) {
					System.in.read();
					session.refresh(employee);
					System.out.println("Name After Updation : " + employee.geteName());
				}
			}	
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
				if(session!=null) {
					HibernateUtil.closeSession(session);
					HibernateUtil.closeSessionFactory();
				}
				
			}catch(HibernateException he){
				he.printStackTrace();
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
	}
}
