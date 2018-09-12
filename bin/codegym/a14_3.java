package codegym;

public class a14_3 {
	
	public static void main(String[] args) {
		//System.out.println("main thread start");
		
//		TestThread thread1 = new TestThread("thread1");
//		TestThread thread2 = new TestThread("thread2");
//		TestThread thread3 = new TestThread("thread3");
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
		Thread thread1 = new Thread(new TestRunnable("thread1"));
		Thread thread2 = new Thread(new TestRunnable("thread2"));
		Thread thread3 = new Thread(new TestRunnable("thread3"));

		try {
			thread3.join(); //讓程式強制讓thread3單獨執行完成後才能往下走
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread1.start();
		thread2.start();
		thread3.start();

		//System.out.println("main thread end");
		
	}
	
}
