package files;

import io.restassured.path.json.JsonPath;

public class ReusableMethod 
{

	public static JsonPath rawtoJson(String res)
	{
		
		
		JsonPath new1=new JsonPath(res);
		return new1;
		
	}
	
	
}
