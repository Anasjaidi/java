package love.code;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
//		super();
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "work";
	}
	


	@Override
	public String getDailyFortunet() {
		// TODO Auto-generated method stub
		return "Fortune";
	}

}
