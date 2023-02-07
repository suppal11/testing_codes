package testing;

public class override_test 

{
	public void fun(int i)
    {
        System.out.println("fun(Integer ) ");
    }
    public void fun(String name)
    {
        System.out.println("fun(String ) ");
    }
	
    public static void main(String[] args) 
    {
    	override_test mv = new override_test();
        
        
        mv.fun(null);

	}

}
