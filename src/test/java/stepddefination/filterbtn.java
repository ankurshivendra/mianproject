package stepddefination;

import functionalstep.filterbuttn;
import io.cucumber.java.en.Then;

public class filterbtn {
	
	filterbuttn ft = new filterbuttn();
	
	@Then("verify filter button")
	public void verify_filter_button() {
		
		ft.verify_filter_button();
	}
	
	@Then("verify filter success")
	public void verify_filter_success(){
		
		ft.verify_filter_success();
	}

}
