package love.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import love.code.Coach;
import love.code.FortuneService;
import love.code.HappyFortuneService;
import love.code.SwimCoach;

@Configuration
//@ComponentScan("love.code")
public class springConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return (new HappyFortuneService());
	}
	
	
	@Bean
	public Coach swimCoach() {
		return (
				new SwimCoach(happyFortuneService())
		);
	}
	
	
}
