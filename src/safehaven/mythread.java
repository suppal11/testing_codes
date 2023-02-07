package safehaven;

class exp extends Thread
{
	public long getId()
	{
		long l = super.getId()+1;
		return l;
		
	}
	
	public void run()
	{
		System.out.println(getId());
	}
}

public class mythread {

	public static void main(String[] args)
	{
		exp t1=new exp();
		t1.start();

	}

}
