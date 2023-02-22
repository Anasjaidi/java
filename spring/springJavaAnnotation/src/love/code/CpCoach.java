package love.code;

import org.springframework.stereotype.Component;

@Component
public class CpCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Helo i'am Cp Coach";
	}

}
