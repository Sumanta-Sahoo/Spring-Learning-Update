package ai.merit.dao;

import java.io.IOException;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ai.merit.Util.CRUDUtill;
import ai.merit.dto.Student;

public class StudentDaoImpl implements IStudnetDao {
	
	//RESOURCES USED
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;
	Scanner scan = null;

	@Override
	public String addStudent(Student student) {
		try {
			connection = CRUDUtill.getCRUDIBDCconnection();
			String sqlInsertQuery = "INSERT INTO std_servlet_app(`SNAME`,`SAGE`,`SADDR`)VALUES(?,?,?)";
			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			if(pstmt!=null) {
				pstmt.setString(1, student.getsName());
				pstmt.setInt(2, student.getsAge());
				pstmt.setString(3, student.getsAddr());
				
				int rowAffected = pstmt.executeUpdate();
				if(rowAffected==1)
					return "success";
			}
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failure";
	}

	@Override
	public Student searchStudent(Integer sid) {
		String sqlInsertQuery = "SELECT SNAME,SAGE,SADDR FROM std_servlet_app WHERE SID=?";
		Student student = null;
		try {
			connection = CRUDUtill.getCRUDIBDCconnection();

			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			if(pstmt!=null)
				pstmt.setInt(1, sid);
			if(pstmt!=null) {
				resultSet = pstmt.executeQuery();
			}if(resultSet!=null) {
				if(resultSet.next()) {
					student = new Student();
					//Copy RESULTSET data into Student Object
					student.setsID(sid);
					student.setsName(resultSet.getString(1));
					student.setsAge(resultSet.getInt(2));
					student.setsAddr(resultSet.getString(3));

					return student;
				}
			}
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		try {
			connection = CRUDUtill.getCRUDIBDCconnection();
			String sqlDeleteQuery = "DELETE FROM std_servlet_app WHERE SID=?";
			if(connection!=null)
				pstmt = connection.prepareStatement(sqlDeleteQuery);
			if(pstmt!=null) {
				pstmt.setInt(1, sid);
				
				int rowAffected = pstmt.executeUpdate();
				if (rowAffected==1)
						return "success";
				else
					return "failure";
			}
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
