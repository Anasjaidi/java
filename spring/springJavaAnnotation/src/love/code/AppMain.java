package love.code;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		try {
			
			/**
			 * Create Application Context
			 * */
			ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("./applicationContext.xml");
			
			
			/**
			 * Retrieve The bean with Default name (first char lower)
			 * */
			Coach cpCoach = appCtx.getBean("cpCoach", Coach.class);
			
			/**
			 * Retrieve the bean with ID
			 * */
			Coach tennisCoach = appCtx.getBean("MyCoach", Coach.class);
			
			
			/**
			 * test the retrieved Beans
			 * */
			System.out.println(cpCoach.getDailyWorkOut());
			System.out.println(tennisCoach.getDailyWorkOut());
			System.out.println(cpCoach.getDailyFortunet());
			System.out.println(tennisCoach.getDailyFortunet());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
