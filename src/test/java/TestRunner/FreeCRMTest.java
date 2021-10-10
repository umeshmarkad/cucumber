package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/FreeCRM.feature"},
		glue= {"StepDefination"},
		monochrome=true)
public class FreeCRMTest {

}
