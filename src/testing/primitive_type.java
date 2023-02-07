package testing;



public class primitive_type
{

	public static void main(String[] args)
	{
		 int x = 5;
		 primitive_type b=new primitive_type();
		 
	        b.change(x);
	        System.out.println(x);

	}
	public void change(int x)
    {
        x = 10;
        System.out.print("New value of"+x);
    }

}
