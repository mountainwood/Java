////anonymous class-1
//anonymous class 適合只有一個方法
public class ThreadDemo5 extends Thread{
	public ThreadDemo5(String threadName) {			
		super(threadName);
	}

	public static void main(String[] args) {
		ThreadDemo5 t1 = new ThreadDemo5("Thread 1") {
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName()+ ": Number" + i);
				}
			}
		};		

		t1.start();								
		ThreadDemo5 t2 = new ThreadDemo5("Thread 2") {
			public void run() {
				for(int i = 0; i < 100; i++) {
				System.out.println(getName()+ ": Number" + i);
				}
			}
		};


		t2.start();
	}

}
