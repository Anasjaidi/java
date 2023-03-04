package love.code;

import org.springframework.stereotype.Component;


/**
 * When we use @Compenent Annotation the spring container will scan the class and create a bean with id
 * @id => class name with first char lowercase
 * */
@Component
public class RandomService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "hello, this is random fortune service";
	}

}
