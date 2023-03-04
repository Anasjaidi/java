package love.code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import love.code.config.springConfig;

public class springNoXmlAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(springConfig.class);
	
	
		/**
		 * Retrieve The bean with Default name (first char lower)
		 * */
//		Coach cpCoach = appCtx.getBean("cpCoach", Coach.class);
		Coach swimCoach = appCtx.getBean("swimCoach", Coach.class);
		
		/**
		 * Retrieve the bean with ID
		 * */
//		Coach tennisCoach = appCtx.getBean("MyCoach", Coach.class);
		
		
		/**
		 * test the retrieved Beans
		 * */
//		System.out.println(cpCoach.getDailyWorkOut());
//		System.out.println(tennisCoach.getDailyWorkOut());
//		System.out.println(cpCoach.getDailyFortunet());
//		System.out.println(tennisCoach.getDailyFortunet());
		System.out.println(swimCoach.getDailyFortunet());
	}

}
