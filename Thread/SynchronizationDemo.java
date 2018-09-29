//自己寫的錯誤寫法
public class SynchronizationDemo implements Runnable{
	private Thread t;
	private int[] nums;
	static SumArray sa = new SumArray();
	public SyncDemo(String threadName, int[] nums) {
		t = new Thread(this, threadName);
		this.nums = nums;
		t.start();
	}
	public void run() {
		int ans = sa.sumArr(nums);
		System.out.println(t.getName() + "：sum" + ans);
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		new SynchronizationDemo("Thread 1", nums);
		new SynchronizationDemo("Thread 2", nums);
	}
}

class SumArray{
	int sum;
	public synchronized int sumArr() {
		
	}
}
