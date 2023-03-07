package love.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	
	@Max(value = 10, message = "less than 10")
	@Min(value = 0, message = "greater or equal 0")
	private String freePass;
	
	
	private String firstName;
	
	
	public String getFreePass() {
		return freePass;
	}
	public void setFreePass(String freePass) {
		this.freePass = freePass;
	}
	
	@NotNull(message = "is req")
	@Size(min = 1, message = "is req")
	private String lastName;
	
	
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
