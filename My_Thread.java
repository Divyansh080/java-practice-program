/*WRITE A JAVA PROGRAM TO CREATE A THREAD USING THREAD CLASS*/

public class My_Thread extends Thread {
    @Override
    public void run() {
        System.out.println("This code is running in a thread.");
    }

    public static void main(String[] args) {
        My_Thread thread = new My_Thread();  // Create a new thread object
        thread.start();  // Start the thread (invokes the run() method)
        System.out.println("This code is outside of the thread.");
    }
}
