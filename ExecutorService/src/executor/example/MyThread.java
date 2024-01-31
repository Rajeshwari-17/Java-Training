package executor.example;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
	
	String name;
	CountDownLatch latch;
	MyThread(CountDownLatch latch,String name)
	{
		this.name = name;
		this.latch = latch;
		
		new Thread(this);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(name + ":" + i);
			latch.countDown();
		}

	}

}
