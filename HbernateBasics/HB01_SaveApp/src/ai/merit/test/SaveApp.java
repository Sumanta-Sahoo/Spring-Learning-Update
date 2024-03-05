package ai.merit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ai.merit.model.Student;
import ai.merit.util.HibernateUtil;

public class SaveApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		session = HibernateUtil.getSession();
		
		try {
			if(session!=null)
				transaction = session.beginTransaction();
			if(transaction!=null) {
				Student std = new Student();
				std.setId(2);
				std.setName("Abinash");
				std.setRegd("ABC13");
				
				session.save(std);
				flag = true;
			}
		}catch(HibernateException HE) {
			HE.printStackTrace();
		}catch(Exception E) {
			E.printStackTrace();
		}finally {
			if(flag) {
				transaction.commit();
				System.out.println("Object saved to DB");
			}else {
				transaction.rollback();
				System.out.println("Object not saved to DB");
			}
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
		
	}

}
