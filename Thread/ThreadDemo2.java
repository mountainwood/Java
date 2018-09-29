////寫法二、自行加入建構子，與決定建構子要放在哪裡？
public class ThreadDemo2 extends Thread{
	public ThreadDemo2(String threadName) {			//甲， 建構子加在這的原因是因為是父系的成員變數
		super(threadName);
	}
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName()+ ": Number" + i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2("Thread 1");		//The constructor ThreadDemo2(String) is undefined
															//要加建構子，加在 甲

		t1.start();								
		ThreadDemo2 t2 = new ThreadDemo2("Thread 2");

		t2.start();
	}

}
