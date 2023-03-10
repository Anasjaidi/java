package love.code.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;


import org.hibernate.*;

import love.code.hibernate.entity.Student;


/**
 * alter table hb_student_tracker.student AUTO_INCREMENT=300
 * 
 * */

/**
 * truncate hb_student_tracker.student
 * 
 * TRUNCATE is a SQL command that is used to remove all rows from a table,
 * in a database. When you execute the TRUNCATE command on a table,
 * it deletes all the data in the table and resets any auto-incrementing IDs or sequences.
 * */
public class CreateStudent {

	public static void main(String[] args) {

		/**
		 * start session factory
		 * */
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		/**
		 * create session
		 * */
		
		Session session = factory.getCurrentSession();
		
		
		try {
			/**
			 * Create 3 students object 
			 * */
			
				Student student1 = new Student("anas", "anas", "anas.jaidi@icloud.com");
				Student student2 = new Student("robin", "hood", "anas.jaidi@icloud.com");
				Student student3 = new Student("jaidi", "jaidi", "anas.jaidi@icloud.com");
			
			/**
			 * create a transaction
			 * */
				
				session.beginTransaction();
			
			/**
			 * save the students objects
			 * */
				
				session.save(student1);
				session.save(student2);
				session.save(student3);
			
			/**
			 * commit the transaction
			 * */
				session.getTransaction().commit();
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
