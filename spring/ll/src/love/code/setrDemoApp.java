package love.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setrDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach myBeanCoach = appCtx.getBean("MyCricketCoach", CricketCoach.class);
		System.out.println(myBeanCoach.gdf());
		System.out.println(myBeanCoach.getEmailAddress());
		System.out.println(myBeanCoach.getTeam());
		
		appCtx.close();
	}

}
