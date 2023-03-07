package love.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String firstName; 
	
	private String lastName; 
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("FR", "france");
	}
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
