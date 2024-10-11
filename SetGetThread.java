

public class SetGetThread
{
	public static void main(String[] args) 
	{
Thread myThread = new Thread(new MyThread());
myThread.setName("MyThread");
myThread.setPriority(Thread.MAX_PRIORITY);
myThread.start();

System.out.println("main thread name:"+Thread.currentThread().getName());
System.out.println("main thread priority:"+Thread.currentThread().getPriority());
} 
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("thread is running with name:"+ Thread.currentThread().getName());
		System.out.println("thread priority:"+ Thread.currentThread().getPriority());
	}
}

