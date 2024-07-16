  package stepddefination;

import functionalstep.loginsteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginvalidation {

	loginsteps log = new loginsteps();

	@Given("enter valid username {string} password {string}")
	public void enter_valid_username_password(String user, String pass) {

		log.enter_valid_username_password(user, pass);
		// log.click_on_login_button();
	}

	@When("click on login button")
	public void click_on_login_button() {

		    log.click_on_login_button();

	}

}
