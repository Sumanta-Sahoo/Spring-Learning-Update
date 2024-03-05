package ai.merit.service;

import ai.merit.dto.Student;

public interface IStudentService {
	
	public String addStudent(Student student);
	
	public Student searchStudent(Integer sid);

	public String updateStudent(Student student);

	public String deleteStudent(Integer sid);
	
}
