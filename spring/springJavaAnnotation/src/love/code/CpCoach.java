package love.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CpCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService") // add bean ID ("first char lower in case of default")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	private FortuneService fortuneService;
	
//	@Autowired
//	public CpCoach(FortuneService _fortunrService) {
//		fortuneService = _fortunrService;
//	}

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
