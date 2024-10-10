/*WRITE A JAVA PROGRAM TO CREATE A THREAD USING THREAD CLASS
  A THREAD USING A RUNNABLE INTERFACE */

public class My_Runnable implements Runnable 
{
    public void run()
	{
        System.out.println("This code is running in a thread.");
    }

    public static void main(String[] args)
	{
        My_Runnable runnable = new My_Runnable(); 
		Thread thread = new Thread(runnable);
        thread.start();  
        System.out.println("This code is outside of the thread.");
    }
}
