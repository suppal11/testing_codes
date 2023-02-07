import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ics\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://automationpractice.com/index.php?id_category=9&controller=category";



		driver.get(baseUrl);


	}

}
