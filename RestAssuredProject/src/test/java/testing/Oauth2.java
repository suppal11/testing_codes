package testing;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class Oauth2 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/shivaniuppal/Downloads/chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
		d.close();
		String whole_string="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AWgavdfrJSZws1YpcOoacFUIV4SvuAv8ZVv47e4RMP-b8psRNc3bSVqH82rCd4ptUF0TrQ&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		String a=whole_string.split("code=")[1];
		String b=a.split("&scope")[0];
		
		
		String json1=given().urlEncodingEnabled(false).queryParam("code",b )
		.queryParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com" )
		.queryParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type","authorization_code").when().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath new1=new JsonPath(json1);
		String access_token= new1.get("access_token");
		
		
		
		
		String res=given().queryParam("access_token",access_token )
	.when().get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(res);
		
		Basic_Info response=given().queryParam("access_token","ya29.a0AX9GBdU7D6WPku_lbGLyZ4e3dimLGDjgVNQ8OSPSDMoC3mBuaMtzNb1QKPN9aIshNBwuuF4NdZL-4Wa2NluzRfXHToYMi1xEQ4p0dLacWukppE3Joy5gqYS5IatK91l3wOVgGU33qiz8kIUyVEL3Fuzdzn-D-AaCgYKAdgSARMSFQHUCsbCI81MLBOxKe2erMKEEBMkvA0165").expect().defaultParser(Parser.JSON).
				when().get("https://rahulshettyacademy.com/getCourse.php").as(Basic_Info.class);
		
					System.out.println(response.getLinkedIn());
					List<Api> api_data=response.getCourses().getApi();
					for(int i=0;i<api_data.size();i++)
					{
						System.out.print(api_data.get(i).getCourseTitle());
								
					}
		             ArrayList<String> arr1 = new ArrayList<String>();
					
					String arr[]= {"Selenium Webdriver Java" ,"Cypress","Protractor"};
					List<String> expected_list=Arrays.asList(arr);
					
					
					List<WebAutomation> true_list=response.getCourses().getWebAutomation();
					for(int i=0;i<true_list.size();i++)
					{
						arr1.add(true_list.get(i).getCourseTitle());
						
					}
					System.out.println("Expected list"+expected_list);
					System.out.println("Test list"+arr1);
					
					Assert.assertEquals(expected_list, arr1);
					
					Map<String,String> titlemap=ImmutableMap.of("Google","Google_India","Amazon","Amazon_India");
					System.out.println(titlemap.get("Google"));
					
					
		
	}

}
