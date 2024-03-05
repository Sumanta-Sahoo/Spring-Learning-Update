package ai.merit.HB.TestApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ai.merit.HB.HibernateUtil.HibernateUtil;
import ai.merit.HB.model.HBStudnet;

public class GetApp {

	public static void main(String[] args) {
		Session session = null;
		
		session = HibernateUtil.getSession();
		try {
				if(session!=null) {
					HBStudnet std = session.get(HBStudnet.class,4);
					if(std!=null)
						System.out.println(std);
					else
						System.out.println("NOT FOUND");
			}
			
		}catch(

	HibernateException HBE)
	{
			HBE.printStackTrace();
		}finally
	{
		try {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();

		} catch (Exception E) {
			E.printStackTrace();
		}
	}

}

}
