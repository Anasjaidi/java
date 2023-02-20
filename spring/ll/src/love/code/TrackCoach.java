package love.code;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String gdwo() {
		// TODO Auto-generated method stub
		return "Hello, Track!";
	}
	
	public TrackCoach(FortuneService _fortuneService) {
		fortuneService = _fortuneService;
	}

	@Override
	public String gdf() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
