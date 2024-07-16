package stepddefination;

import functionalstep.cartsteps;
import io.cucumber.java.en.Then;

public class cartbtn {
	
	cartsteps cart = new cartsteps();
	
	@Then("add product into cart")
	public void add_product_into_cart() {
		 
		cart.add_product_into_cart();
	}
	
	@Then("verify cart element")
	public void verify_cart_element() {
		cart.verify_cart_element();
	}
	
	@Then("click on cart btn")
	public void  click_on_cart_btn() throws InterruptedException {
		
		cart.click_on_cart_btn();
	}
	


}
