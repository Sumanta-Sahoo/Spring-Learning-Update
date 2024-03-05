package ai.merit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ai.merit.dto.Student;
import ai.merit.service.IStudentService;
import ai.merit.serviceFactory.StudentServiceFactory;


@WebServlet("/test/*")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		IStudentService stdService = StudentServiceFactory.getStudentService();
		
		System.out.println("Request URI :: " + request.getRequestURI());
		System.out.println("Request path info :: " + request.getPathInfo());
		
		if(request.getRequestURI().endsWith("Insert")) {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String address = request.getParameter("address");
			Student std = new Student();
			std.setsName(name);
			std.setsAge(Integer.parseInt(age));
			std.setsAddr(address);
			PrintWriter out = response.getWriter();
			
			
			String status = stdService.addStudent(std);
			if(status.equalsIgnoreCase("success")) {
				out.println("<h1 style='color:red; text-align:center;'>INSERTION COMPLETED</h1>");
			}else {
				out.println("<h1 style='color:red; text-align:center;'>INSERTION FAILED</h1>");
			}
			out.close();
			
		}
		
	}

}
