package love.code;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	@Override
	public String gdwo() {
		// TODO Auto-generated method stub
		return "Hello, Baseball!";
	}
	
	public BaseballCoach(FortuneService _fortuneService) {
		fortuneService = _fortuneService;
	}

	@Override
	public String gdf() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
