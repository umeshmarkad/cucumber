package TestRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/Datadriven.feature"},
		glue= {"StepDefination1"},
		monochrome=true,
		dryRun=false,
		
		plugin= {"html:Files/a.html",
				"json:Files/y.json",
				"junit:Files/c.xml",
				"pretty:Files/b.txt"
		}
		)


public class datadriven {

}
