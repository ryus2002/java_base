package codegym;

public class TestThread extends Thread {
	
	private String name;
	
	public TestThread (String name){
		this.name = name;
	}
	
	public void run(){
		if("thread1".equals(name))
			Thread.yield();
		System.out.println(name + " Running");
	}
}
