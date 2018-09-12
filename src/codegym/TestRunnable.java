package codegym;

public class TestRunnable implements Runnable{
	
	private String name;
	
	public TestRunnable(String name){
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " start.");
		
		// Test yield()
//		if("thread1".equals(name))
		//�|��귽���X�ӵ���LThread����
//			Thread.yield();
		
		// Test Sleep()
		try {
			if("thread1".equals(name))
				Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		
		System.out.println(name + " running.");
		System.out.println(name + " end.");
	}


}
