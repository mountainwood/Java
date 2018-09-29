//使用RunnableDemo裡的方法
public class JoinDemo {
	
	public static void main(String[] args) {
		RunnableDemo nt1 = new RunnableDemo("Thread 1");
		RunnableDemo nt2 = new RunnableDemo("Thread 2");
		System.out.println(nt1.t.getName() + "：" + nt1.t.isAlive());
		System.out.println(nt1.t.getName() + "：" + nt1.t.isAlive());
		try {
			nt1.t.join();
			//System.out.println(nt1.t.getName() + "：" + nt1.t.isAlive());
			//System.out.println(nt1.t.getName() + "：" + nt1.t.isAlive());		可以用來測試nt1hoo ive srl ybgzsyo jcs 
			nt2.t.join();
		}catch (InterruptedException e) {}
		System.out.println(nt1.t.getName() + "：" + nt1.t.isAlive());
		System.out.println(nt1.t.getName() + "：" + nt1.t.isAlive());
	}
	

}
