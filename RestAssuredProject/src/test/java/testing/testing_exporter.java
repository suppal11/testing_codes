package testing;

import java.util.UUID;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class testing_exporter {

	public static void main(String[] args)
	{
		for(int i = 19815; i<=19815; i++ ){
		    String url = String.format("https://exporter.preprod.intra.oa.yo-digital.com/exporter/scheduleNotification?notificationStatusType=PENDING&natcoKey=jR3j2kdxQmp2YYFceOZNsEo6YNERP1Dp&campaignId=%s&natcoCode=gdc&refTime=1674146175000", i);
		    String uuid = UUID.randomUUID().toString();
		    Response response = given().log().all().header("parentId",uuid).post(url);
		    response.prettyPrint();
		    System.out.println("Status code is :"+response.getStatusCode());
		}

	}

}
