package StepDefination1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import StepDefination.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datadriven extends Baseclass {


@Given("user enter Free CRM url")
public void user_enter_free_crm_url() {
	Baseclass.intialmethod("https://ui.cogmento.com/");
	
}
@When("user enter {string} and {string}")
public void user_enter_and(String username, String password) throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	Thread.sleep(3000);
	
}
@Then("user is on Homepage")
public void user_is_on_homepage() {
	String a=driver.findElement(By.xpath("//*[@class='user-display']")).getText();
	System.out.println(a);
}
@Then("Take screenshot and close App")
public void take_screenshot_and_close_app() throws InterruptedException {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File fs=ts.getScreenshotAs(OutputType.FILE);
	File path =new File(System.getProperty("user.dir"+"/Screenshot"+System.currentTimeMillis()+".png"));
	
	try {
		FileUtils.copyDirectory(fs, path);//
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	driver.close();
	
}
}
