package love.code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String userString ="hbstudent";
		String passString = "hbstudent";

		try {
			System.out.println("conneccting to db");
			Connection myConnection = DriverManager.getConnection(jdbcUrl, userString, passString);
			
			System.out.println("db connected!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
