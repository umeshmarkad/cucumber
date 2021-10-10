package StepDefination;

import io.cucumber.java.en.Given;

public class Demo {

	@Given("user enter valid data")
	public void user_enter_valid_data() {
	    System.out.println("user enter valid data");
	    
	}

	@Given("user is on contactpage")
	public void user_is_on_contactpage() {
	   System.out.println("user is on contactpage");
	}

	@Given("user is on Deals page")
	public void user_is_on_deals_page() {
	    System.out.println("user is on Deals page");
	}
	
	@Given("user is on ComponiesPage")
	public void user_is_on_componies_page() {
	    System.out.println("user is on ComponiesPage");
	}

}
