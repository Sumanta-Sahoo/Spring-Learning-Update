import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.app.model.Student;
import hibernate.app.util.HibernateUtil;

public class SaveApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				Student std = new Student();
				std.setsName("Sumant");
				std.setsID(1);
				std.setsAddr("BNGL");
				std.setsAge(23);

				session.persist(std);
				flag = true;
			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag == true) {
				transaction.commit();
				System.out.println("Persistence Operation Sucess");
			} else {
				transaction.rollback();
				System.out.println("Persistence Operation Failed");
			}
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
