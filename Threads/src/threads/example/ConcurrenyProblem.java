package threads.example;

public class ConcurrenyProblem extends Thread {
	public static int amount =0;
	public static void main(String[] args)

	{
		ConcurrenyProblem thread = new ConcurrenyProblem();
		thread.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	public void run()
	{
		amount++;
	}
}
