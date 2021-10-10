package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;
	
	public static void intialmethod(String url) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\New folder\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(url);
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	}
}
