////�g�k�G�B�ۦ�[�J�غc�l�A�P�M�w�غc�l�n��b���̡H
public class ThreadDemo2 extends Thread{
	public ThreadDemo2(String threadName) {			//�ҡA �غc�l�[�b�o����]�O�]���O���t�������ܼ�
		super(threadName);
	}
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName()+ ": Number" + i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2("Thread 1");		//The constructor ThreadDemo2(String) is undefined
															//�n�[�غc�l�A�[�b ��

		t1.start();								
		ThreadDemo2 t2 = new ThreadDemo2("Thread 2");

		t2.start();
	}

}
