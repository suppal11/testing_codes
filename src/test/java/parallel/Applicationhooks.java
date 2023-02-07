package parallel;

import java.util.Properties;

import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.Driverfactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Applicationhooks
{
	private Driverfactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	
	@Before(value="@Skip",order=0)
	public void skip_sceanrio(Scenario sc)
	{
		System.out.println("Skipped Sceanrio is "+sc.getName());
		Assume.assumeTrue(false);
	}

	@Before(order=1)
	public void getProperty()
	{
		configReader=new ConfigReader();
		prop=configReader.init_prop();
	}

	@Before(order=2)
	public void launchbrowser()
	{
		String browsername=prop.getProperty("browser");
		driverfactory=new Driverfactory();
		driver=driverfactory.init_driver(browsername);
		
	}

	@After(order=0)
	public void quitBrowser()
	{
		
		driver.quit();
	}

	@After(order=1)
	public void teardown(Scenario scenario)
	{
		if (scenario.isFailed()) 
		{
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}

	}
}
