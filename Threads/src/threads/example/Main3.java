package threads.example;
/* To avoid the concurrency problem it is best to shareas few
 * attributes between threads as possible. If attributes have to 
 * be shared one possible solution is to use isAlive() method. */
public class Main3 extends Thread{
	public static int amount =0;
	public static void main(String[] args)
	{
		Main3 thread = new Main3();
		thread.start();
		while(thread.isAlive())
		{
			System.out.println("Waitng...");
		}
		System.out.println("Main: " + amount);
		amount++;
		System.out.println("Main: " + amount);

		
	}
	public void run()
	{
		amount++;
	}

}
