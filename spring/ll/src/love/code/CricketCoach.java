package love.code;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		this.team = team;
	}



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
