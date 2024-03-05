package ai.merit.daoFactory;
import ai.merit.dao.IStudnetDao;
import ai.merit.dao.StudentDaoImpl;

public class StudentDaoFactory {
	private StudentDaoFactory() {
		
	}
	
	private static IStudnetDao studentDoa = null;
	
	public static IStudnetDao getStudentDao() {
		if(studentDoa==null)
			studentDoa = new StudentDaoImpl();
		return studentDoa;
	}
	
}
