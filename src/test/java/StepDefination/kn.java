package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class kn {

	 WebDriver driver;
	@Given("user open Facebook app")
	public void user_open_facebook_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	driver.findElement(By.name("firstname")).sendKeys("umesh");
	
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
	}
}
