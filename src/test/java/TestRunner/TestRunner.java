package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features.feature/loginpage"},//location
		glue= {"StepDefination"},//attach step-defination package
		monochrome=true
		
)

public class TestRunner {

}
