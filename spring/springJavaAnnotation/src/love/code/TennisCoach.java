package love.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyCoach")
public class TennisCoach implements Coach {
	
	/**
	 * Start Private Attributes
	 * */
	private FortuneService fortuneService;
	
	
	
	/**
	 * Start Class Constructors
	 * @author Anas.Jaidi
	 * 
	 * {@summary} @Autowired Tell spring
	 * 						 to Auto lookup and inject the targeted class 
	 * */
	@Autowired
	public TennisCoach(FortuneService _fortuneService) {
		fortuneService = _fortuneService;
	}
	
	
	
	/**
	 * Start Base Methods override 
	 * */
	@Override
	public String getDailyWorkOut() {
		
		return "Tennis Coach";
	}



	@Override
	public String getDailyFortunet() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
