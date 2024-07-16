package stepddefination;

import functionalstep.navigationvalidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class navigationvalidate {
	navigationvalidation nav = new navigationvalidation();

	@And("check working of navigation button working")
	public void check_working_of_navigation_button_working() {

		nav.check_working_of_navigation_button_working();

	}

	@And("close navigation bar")
	public void close_navigation_bar() {

		nav.close_navigation_bar();

	}

	@Then("check successful selection on navigation")
	public void check_successful_selection_on_navigation() {
		
		nav.check_successful_selection_on_navigation();

	}
	
	@Then("successful selection")
	public void successful_selection() {
		
		
	nav.successful_selection();
	}
}
