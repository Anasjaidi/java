package love.code;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	private FortuneService fortuneService2;
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

	@Override
	public String cdf() {
		// TODO Auto-generated method stub
		fortuneService2 = new HappyFortuneService();
		
		return fortuneService2.getFortune();
	}
}
