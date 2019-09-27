package anno1_required;

import org.springframework.beans.factory.annotation.Required;

public class Abc {
	private int number;
	
	@Required
	public void setNumber(int number) { // setter 강요 (@Required)
		this.number = number;
	}
	
	public String showData() {
		return "number :  " + number;  
	}
}