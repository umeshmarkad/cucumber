package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/ContactPage.feature"},//location
		glue= {"StepDefination"},//attach step-defination package
		monochrome=true
		
)

public class ContactPage {

}
