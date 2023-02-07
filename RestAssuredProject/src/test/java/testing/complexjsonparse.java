package testing;

import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class complexjsonparse {

	public static void main(String[] args) {
		JsonPath n1 = new JsonPath(payload.Jsonres());
		int courses_size = n1.getInt("courses.size()");
		int sum=0;
		int n11=0;
		int n21=0;
		System.out.println("Courses size"+courses_size);

		System.out.println("purchase amount"+n1.getInt("dashboard.purchaseAmount"));

		System.out.println(n1.getString("courses[0].title"));
		
		

		for (int i = 0; i <= 2; i++) {
			System.out.println(n1.getString("courses[" + i + "].title"));
			System.out.println(n1.getInt("courses[" + i + "].price"));
			n11=n1.getInt("courses[" + i + "].price");
			n21=n1.getInt("courses[" + i + "].copies");
			
			sum=sum+n11*n21;
			

			if (n1.getString("courses[" + i + "].title").equals("RPA")) {
				System.out.println(n1.getInt("courses[" + i + "].copies"));
				break;

			}
			
			

		}
//		if(sum>n1.getInt("dashboard.purchaseAmount"))
//		{
//			System.out.println("sum"+sum);
//		}
//		else
//		{
//			System.out.println("bakwass"+sum);
//		}
		Assert.assertEquals(sum, n1.getInt("dashboard.purchaseAmount"),"Yes it worked");
		

	}

}
