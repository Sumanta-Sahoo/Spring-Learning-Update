package ai.merit.Util;

import java.io.FileInputStream;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CRUDUtill {
	public static Connection getCRUDIBDCconnection() throws IOException, SQLException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\Desktop\\JAVA SERVLET\\JDBCCRUD\\src\\prop.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
		
		String url="jdbc:mysql:///PWSKILLS";
		String user="ropt";
		String password="sum@0391S";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	public static void cleanUp(Connection connection,Statement statement, ResultSet resultSet){
		try {
			if(connection!=null)
				connection.close();
			if(statement!=null)
				statement.close();
			if(resultSet!=null)
				resultSet.close();
		}catch(SQLException SQLE) {
			SQLE.printStackTrace();
		}
	}
}
