package love.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String firstName; 
	
	public String[] getOs() {
		return os;
	}


	public void setOs(String[] os) {
		this.os = os;
	}


	private String lastName; 
	
	private String country;
	
	private String language;
	private String[] os = new String[10];
	
	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


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
