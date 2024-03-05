package ai.merit.HB.TestApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ai.merit.HB.HibernateUtil.HibernateUtil;
import ai.merit.HB.model.HBStudnet;

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
				HBStudnet std = new HBStudnet();
				std.setId(4);
				std.setName("Abhinash");
				std.setCity("BLGR");
				std.setAge(24);
				
				session.save(std);
				flag = true;
			}
			
		}catch(HibernateException HBE) {
			HBE.printStackTrace();
		}finally {
			if(flag == true)
				transaction.commit();
			try {
				HibernateUtil.closeSession(session);
				HibernateUtil.closeSessionFactory();;
				
			}catch(Exception E){
				E.printStackTrace();
			}
		}
		
	}

}
