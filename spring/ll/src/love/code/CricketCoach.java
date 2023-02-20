package love.code;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;

	@Override
	public String gdwo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String gdf() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String cdf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String df() {
		// TODO Auto-generated method stub
		return null;
	}

}
