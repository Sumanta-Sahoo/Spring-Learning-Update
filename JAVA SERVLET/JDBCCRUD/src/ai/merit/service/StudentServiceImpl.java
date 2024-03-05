package ai.merit.service;
import ai.merit.dto.Student;
import ai.merit.daoFactory.StudentDaoFactory;
import ai.merit.dao.IStudnetDao;

public class StudentServiceImpl implements IStudentService {

	private IStudnetDao stdDao;
	@Override
	public String addStudent(Student student) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.addStudent(student);
	}

	@Override
	public Student searchStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.deleteStudent(sid);
	}

}