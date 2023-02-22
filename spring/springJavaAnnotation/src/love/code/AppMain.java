package love.code;

import java.lang.constant.Constable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		try {
			
			ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("./applicationContext.xml");
			
			
			/**
			 * Retrieve The bean with Default name (first char lower)
			 * */
			Coach cpCoach = appCtx.getBean("cpCoach", Coach.class);
			
			/**
			 * Retrieve the bean with ID
			 * */
			Coach tennisCoach = appCtx.getBean("MyCoach", Coach.class);
			
			
			
			System.out.println(cpCoach.getDailyWorkOut());
			System.out.println(tennisCoach.getDailyWorkOut());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
