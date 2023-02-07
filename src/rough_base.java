import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class rough_base {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ics\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://automationpractice.com/index.php?id_category=9&controller=category";



		driver.get(baseUrl);

		driver.manage().window().maximize();  


		Actions builder = new Actions(driver);

		WebElement target = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]//preceding::a[text()='Women']"));
		WebElement target2 =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a"));
		Action mouseOverHome = builder.clickAndHold(target).moveToElement(target2).click().build();


		mouseOverHome.perform();	
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;


		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.findElement(By.id("layered_id_attribute_group_1")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.findElement(By.id("layered_id_attribute_group_8")).click();
		driver.findElement(By.id("layered_id_feature_3")).click();
		driver.findElement(By.id("layered_id_feature_13")).click();
		driver.findElement(By.id("layered_id_feature_21")).click();
		driver.findElement(By.id("layered_quantity_1")).click();
		driver.findElement(By.id("layered_manufacturer_1")).click();
		driver.findElement(By.id("uniform-layered_condition_new")).click();
		//when the preloader disappperars
		driver.findElement(By.className("icon-th-list")).click();
		
		
		
		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		WebElement Element1 = driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"));
		js10.executeScript("arguments[0].scrollIntoView();", Element1);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		//executor.executeScript("window.scrollby(0,700)");
		WebElement element = driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"));
		executor.executeScript("arguments[0].click();",element);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		executor.executeScript("window.scrollBy(0,250)");			
		
		//Element.click();
		driver.findElement(By.className("icon-plus")).click();
		
		
		
		Select sel=new Select(driver.findElement(By.id("group_1")));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		sel.selectByVisibleText("M");
		driver.findElement(By.id("color_15")).click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		System.out.print("Done");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
		
		driver.findElement(By.id("color_16")).click();
		driver.findElement(By.className("icon-minus")).click();
		
		Select sel1=new Select(driver.findElement(By.id("group_1")));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		sel1.selectByVisibleText("L");
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.className("icon-minus")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
	
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 300)");
				
		driver.findElement(By.id("email_create")).sendKeys("abc3@gmil.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		//creating new User
		
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Ram");
		driver.findElement(By.id("customer_lastname")).sendKeys("Lal");
		if (driver.findElement(By.id("email")).equals("abc3@gmail.com"))
		{
			System.out.print("dynamic value is taken");
		}
		
		driver.findElement(By.id("passwd")).sendKeys("Shivi@21");
		
		js1.executeScript("window.scrollBy(0, 500)");
		Select sel12=new Select(driver.findElement(By.name("days")));
		sel12.selectByValue("21");
		Select sel13=new Select(driver.findElement(By.name("months")));
		sel13.selectByValue("10");
		Select sel14=new Select(driver.findElement(By.name("years")));
		sel14.selectByValue("2012");
		
		
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("optin")).click();
		
		driver.findElement(By.id("company")).sendKeys("Capgeminin");
		driver.findElement(By.id("address1")).sendKeys("23 ,12345,capgemini");
		
		js1.executeScript("window.scrollBy(500, 1000)");
		
		driver.findElement(By.id("address2")).sendKeys("sanvidhan towe");
		driver.findElement(By.id("city")).sendKeys("delhi");
		Select sel5=new Select(driver.findElement(By.id("id_state")));
		sel5.selectByValue("5");

		
		driver.findElement(By.id("postcode")).sendKeys("90004");
		driver.findElement(By.id("other")).sendKeys("abc");
		driver.findElement(By.id("phone")).sendKeys("5946946094609");
		
		
		driver.findElement(By.id("phone_mobile")).sendKeys("5946946094609");
		driver.findElement(By.id("submitAccount")).click();
		
		
		driver.findElement(By.name("message")).sendKeys("abcdef");
		driver.findElement(By.name("processAddress")).click();
		
		driver.findElement(By.id("cgv")).click();
		
		js1.executeScript("window.scrollBy(0, 400)");
		driver.findElement(By.name("processCarrier")).click();
		
		driver.findElement(By.className("bankwire")).click();
		js1.executeScript("window.scrollBy(0, 400)");
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		
		
	}

}
