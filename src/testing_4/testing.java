
package testing_4;
import testing.helloworld;



 class testing extends helloworld
{
	public static void main(String args[])
	{
		testing t=new testing();
		try {
			System.out.println("Value of Y is "+t.y+"Value of X is "+t.x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
