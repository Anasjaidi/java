package love.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Coach coach1 = xmlApplicationContext.getBean("cpCoach", Coach.class);
		Coach coach2 = xmlApplicationContext.getBean("cpCoach", Coach.class);
		
		
		System.out.println("is " + (coach1 == coach2));
	}

}
