package love.code;

import org.springframework.stereotype.Component;

@Component("MyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		
		return "Tennis Coach";
	}

}
