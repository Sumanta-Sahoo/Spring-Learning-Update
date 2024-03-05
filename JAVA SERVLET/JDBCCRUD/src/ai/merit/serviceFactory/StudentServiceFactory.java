package ai.merit.serviceFactory;

import ai.merit.service.IStudentService;
import ai.merit.service.StudentServiceImpl;

public class StudentServiceFactory {

	private StudentServiceFactory() {
		
	}
	
	public static IStudentService studentService = null;
	public static IStudentService getStudentService() {
		//
		if(studentService==null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}
}
