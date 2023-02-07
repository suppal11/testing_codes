package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\ics\\eclipse-workspace\\testing\\src\\test\\resources\\featurefiles\\search.feature"},
		glue= {"stepdefinations","hooks"},
		tags= "@smoke or @regression",
		plugin= {"pretty",
				"json:target/Myreports/report.json",
				"junit:target/Myreports/report.xml" 
		},
		monochrome = true,    // for formating the feature file
		dryRun = true    //find out missing steps
		//publish=true
		)

public class amazontest {

}
