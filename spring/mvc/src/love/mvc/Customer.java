package love.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	
	@Max(value = 10, message = "less than 10")
	@Min(value = 0, message = "greater or equal 0")
//	@Size(min = 1, message = "is required")
//	@NotNull(message = "is also req")
    @NotNull(message = "Postal code is required")
	private Integer freePass;
	
	@Pattern(regexp = "^ [a-z1-9A-Z]{5}", message = "need to be 5 chars or more")
	@NotNull(message = "is req")
	@Size(min = 1, message = "is req")
	private String postalCode;
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	private String firstName;
	
	
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
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
