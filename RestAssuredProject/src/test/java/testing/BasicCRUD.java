package testing;

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

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.hamcrest.Matchers.*;
import org.testng.Assert;

import files.ReusableMethod;
import files.payload;

public class BasicCRUD {
	
	/*
	 * Given---prerequest
	 * When-type of request(Http request)+resource
	 * Then-validating the response
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
//		RestAssured.baseURI="https://rahulshettyacademy.com";
//		String res=given().log().all().queryParam("key", "qaclick123").header("Content-Type","text/plain").body(payload.AddPlace()).when().post("maps/api/place/add/json").then().log().all().statusCode(200)
//		
//		
//		.body("scope",equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
//		
		System.out.println("serilization");
		
		basic_root a=new basic_root();
		a.setAccuracy("50");
		a.setName("Frontline house");
		a.setPhone_number("(+91) 983 893 3937");
		a.setAddress("29, side layout, cohen 09");
		a.setWebsite("http://google.com");
		a.setLanguage("French-IN");
		
		Location loca=new Location();
		loca.setLng("33.427362");
		loca.setLat("-38.383494");
		a.setLocation(loca);
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("shoe park");
		arr.add("shop");
		a.setTypes(arr);
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		
		String res=given().queryParam("key", "qaclick123").body(a).when().post("maps/api/place/add/json").then().statusCode(200)
				
				
				.body("scope",equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
				
		
		//System.out.println(res);
		
		RequestSpecification rs=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
		
		ResponseSpecification responsespec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		String finalres=given().spec(rs).body(a).when().post("maps/api/place/add/json").then().spec(responsespec).extract().response().asString();
		System.out.println("it worked"+finalres);
		
		
		//System.out.println();
		
	//	Jsonpath -for parsing json
		
		JsonPath js=new JsonPath(res);
		String place=js.getString("place_id");
		System.out.println("Place ID "+place);
		
		
		//Update Place API
		
		String address2="testing";
		
		given().log().all().queryParam("key", "qaclick123").headers("Content-Type","application/json").body("{\n"
				+ "\"place_id\":\""+place+"\",\n"
				+ "\"address\":\""+address2+"\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}").when().put("maps/api/place/update/json").then().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//Get API
		
		String getplace=given().log().all().queryParam("key", "qaclick123").queryParam("place_id",place).when()
				.get("maps/api/place/get/json").then().assertThat().statusCode(200).extract().response().asString();
		
		//System.out.print(getplace);
		
		JsonPath js1=ReusableMethod.rawtoJson(getplace);
		String place_id_updated=js1.getString("address");
		
		System.out.println("Updated"+place_id_updated);
		Assert.assertEquals(place_id_updated,address2);
		
		
		
		
		
		
	}
	
	/*
	 * 
	 * Add Place--->Update Place with new address--->Get Place to validate if new address is present in response
	 * 
	 * 
	 * 
	 * 
	 */

}
