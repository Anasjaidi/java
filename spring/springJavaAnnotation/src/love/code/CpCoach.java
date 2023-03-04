package love.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CpCoach implements Coach {
	private FortuneService fortuneService;
	
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Autowired
	public CpCoach(FortuneService _fortunrService) {
		fortuneService = _fortunrService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Helo i'am Cp Coach";
	}

	@Override
	public String getDailyFortunet() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
