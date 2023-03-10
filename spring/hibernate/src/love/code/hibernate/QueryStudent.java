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
public class QueryStudent {

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
			
				Student student1 = new Student("test", "test", "test.test@icloud.com");
			
			/**
			 * create a transaction
			 * */
				
				session.beginTransaction();
			
			/**
			 * save the students objects
			 * */
				
				session.save(student1);
			
			/**
			 * commit the transaction
			 * */
				session.getTransaction().commit();
				
				
			/**
			 * create second session and transaction
			 * */
				
				session = factory.getCurrentSession();
				session.beginTransaction();
				
			/**
			 * get the student with ID
			 * */
			
				Student myStudent = session.get(Student.class, student1.getId());
				
			/**
			 * commit the transaction
			 * */
				
				session.getTransaction().commit();
			
			/**
			 * print the student infos
			 * */
			
				
				System.out.println(myStudent);
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
