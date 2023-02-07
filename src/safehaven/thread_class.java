package safehaven;

public class thread_class {

	public static void main(String[] args) throws InterruptedException 
	{
         Thread th = new Thread(new Runnable()
        		 {

					@Override
					public void run() {
						System.out.println("We are now in thread "+Thread.currentThread().getName());
						
						System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
					}
        		 }
        		 
        		 );
         
         th.setName("New worker thread");
         th.setPriority(Thread.MAX_PRIORITY);
         
         System.out.println("We are in thread "+Thread.currentThread().getName()+" before starting a new thread");
         th.start();
         System.out.println("We are in thread "+Thread.currentThread().getName()+" after ending a new thread");
        // Thread.sleep(1000);

	

}
}
