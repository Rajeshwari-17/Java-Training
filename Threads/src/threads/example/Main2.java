package threads.example;

public class Main2 implements Runnable{
	public static void main(String[] args)
	{
		Main obj = new Main();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This block runs outside the thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This block runs inside the thread");

		
		
	}
	

}
