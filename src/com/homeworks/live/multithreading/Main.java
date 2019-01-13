package  com.homeworks.live.multithreading;
public class Main {
	public static void main(String[] args) throws Exception{
		foo("Main thread");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try{
					foo1("Thread 1");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(runnable).start();
		foo("Main throws");
	}

	private static void foo(String threadName)throws InterruptedException {
		for(int i = 0;i<10;i++) {
			System.out.println(threadName + " " + i);
			Thread.sleep(2000);
		}
	}
	private static void foo1(String threadName)throws InterruptedException {
		for(int i = 0;i<10;i++) {
			System.out.println(threadName + " " + i);
			Thread.sleep(1000);
		}
	}
}