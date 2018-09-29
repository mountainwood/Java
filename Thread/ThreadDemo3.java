////寫法三，目前趨勢
public class ThreadDemo3 extends Thread{
	public ThreadDemo3(String threadName) {			//甲， 建構子加在這的原因是因為是父系的成員變數
		super(threadName);
	}
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName()+ ": Number" + i);
		}
	}
	public static void main(String[] args) {
		new ThreadDemo3("Thread 1").start();
						
		new ThreadDemo3("Thread 2").start();

	}

}
