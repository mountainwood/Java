////寫法四，不鼓勵
public class ThreadDemo4 extends Thread{
	public ThreadDemo4(String threadName) {			//甲， 建構子加在這的原因是因為是父系的成員變數
		super(threadName);
		start();				//建構子傳完參數就馬上 start了
	}
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName()+ ": Number" + i);
		}
	}
	public static void main(String[] args) {
		new ThreadDemo4("Thread 1");
						
		new ThreadDemo4("Thread 2");

	}

}
