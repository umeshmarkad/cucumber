package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features/Demo.feature"},
		glue= {"StepDefination"},
		monochrome=true)
		

public class Demo {

	
}
