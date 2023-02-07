package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\ics\\eclipse-workspace\\testing\\src\\test\\resources\\featurefiles\\uber.feature"},
		glue= {"stepdefinations"},
		tags= "@tag22",
	    plugin= {"pretty"}
		)

public class ubertest 
{

}
