package ai.merit.test;


import org.hibernate.HibernateException;
import org.hibernate.Session;

import ai.merit.Util.HibernateUtil;
import ai.merit.model.Student;

public class SaveApp {

	public static void main(String[] args) {
		
		Session session = null;
		int id = 2;
		
		session = HibernateUtil.getSession();
		try {
			if(session!=null) {
				Student std = session.load(Student.class, id);
				if(std!=null) {
					System.out.println("Student ID :: "+std.getId());
					
					System.in.read();
					System.out.println("Student Name :: "+std.getName());
					System.out.println("Student  Age :: "+std.getAge());
					System.out.println("Student City :: "+std.getCity());
			}else
				System.out.println("Record not found in DB having id :: " + std.getId());
			}
		}catch(HibernateException HE) {
			HE.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				HibernateUtil.closeSession(session);
				HibernateUtil.closeSessionFatory();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
