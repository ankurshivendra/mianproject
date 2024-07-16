package stepddefination;

import functionalstep.succefulloginsteps;
import io.cucumber.java.en.Then;

public class verifysuccesfullogin {
	
	succefulloginsteps success = new succefulloginsteps();
	
	@Then("verify login pages")
	public void verify_login_pages() {
		
		success.verify_login_pages();
		
		
	}

}
