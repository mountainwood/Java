////anonymous class-3
//只有 2 個敘述，兩個執行緒
//不一定要加參用了，效能變更好
public class ThreadDemo7{

	public static void main(String[] args) {
		new Thread("Thread 1") {					//自動呼叫物件執行：cpu抓到執行緒(Thread)，就自己呼叫run了
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName()+ ": Number" + i);
				}
			}
		}.start();		//這裡全部只算一行執行緒，注意「;」號
		
		new Thread("Thread 2") {
			public void run() {
				for(int i = 0; i < 100; i++) {
				System.out.println(getName()+ ": Number" + i);
				}
			}
		}.start();
	}

}
	
