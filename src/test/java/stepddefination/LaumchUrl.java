package stepddefination;

import functionalstep.lauchurl;
import io.cucumber.java.en.Given;

public class LaumchUrl {
	
	lauchurl url = new lauchurl();
			

	@Given("verify Url")
	public void verify_url() {
	    
		url.verify_url();
		
		
	}
}