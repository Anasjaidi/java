package love.code;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("MyCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
	
	/**
	 * Start Private Attributes
	 * */
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		
	}
	
//	@Autowired
//	public void usingAnyMethode(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}



	/**
	 * Start Class Constructors
	 * @author Anas.Jaidi
	 * 
	 * {@summary} @Autowired Tell spring
	 * 						 to Auto lookup and inject the targeted class 
	 * */
//	@Autowired
//	public TennisCoach() {
//		fortuneService = _fortuneService;
//	}
	
	
	
	/**
	 * Start Base Methods override 
	 * */
	@Override
	public String getDailyWorkOut() {
		
		return "Tennis Coach";
	}

	@PostConstruct 
	public void springConstructor() {
		System.out.println("init");
	}
	@PreDestroy 
	public void springDestructor() {
		System.out.println("delete");
	}


	@Override
	public String getDailyFortunet() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
