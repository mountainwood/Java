////anonymous class-3
//�u�� 2 �ӱԭz�A��Ӱ����
//���@�w�n�[�ѥΤF�A�į��ܧ�n
public class ThreadDemo7{

	public static void main(String[] args) {
		new Thread("Thread 1") {					//�۰ʩI�s�������Gcpu�������(Thread)�A�N�ۤv�I�srun�F
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName()+ ": Number" + i);
				}
			}
		}.start();		//�o�̥����u��@�������A�`�N�u;�v��
		
		new Thread("Thread 2") {
			public void run() {
				for(int i = 0; i < 100; i++) {
				System.out.println(getName()+ ": Number" + i);
				}
			}
		}.start();
	}

}
	
