package love.code;

import java.lang.constant.Constable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("./applicationContext.xml");
			Coach beanCoach = appCtx.getBean("cpCoach", Coach.class);
			System.out.println(beanCoach.getDailyWorkOut());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
