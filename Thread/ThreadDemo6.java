////anonymous class-2
public class ThreadDemo6{

	public static void main(String[] args) {
		Thread t1 = new Thread("Thread 1") {
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName()+ ": Number" + i);
				}
			}
		};		
		t1.start();								
		Thread t2 = new Thread("Thread 2") {
			public void run() {
				for(int i = 0; i < 100; i++) {
				System.out.println(getName()+ ": Number" + i);
				}
			}
		};
		t2.start();
	}

}
	
