package threads.example;

public class Main extends Thread {
	public static void main(String[] args)
	{
		Main thread = new Main();
		thread.start();
		System.out.println("This block runs outside the thread");
		
	}
	public void run()
	{
		System.out.println("This block runs inside a thread");
	}

}
