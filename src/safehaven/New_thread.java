package safehaven;

class t1 extends Thread
{
	public void run()
	{
		System.out.println("Hi we are here");
	}
}

public class New_thread {

	public static void main(String[] args) 
	{
		//reference for primary thread
		Thread r=Thread.currentThread();
		r.setName("name modified");
		System.out.println(r.getName());
		//System.out.println(r.getName());
	t1 new1 =new t1();
	System.out.println(new1.getName());
	new1.start();
	new1.setName("Shivani Thread");
	System.out.println(new1.getName());
	}

}
