package hw2;
/*
 * �Y���@��÷�l��3000���ءA�C�Ѱťh�@�b�����סA�ݦh�֤�÷�l�����׷|�u��5���ءC*/
public class question06Rope {

	public static void main(String[] args) {
		double rope = 3000;		//÷��
		int day = 0;			//�Ѽ�
		while ( rope > 5) {		//�p��5���خɡA�έp�Ѽ�
			rope = rope / 2;
			day++;
			
			System.out.printf("�� %d ��", day);
			System.out.printf("÷��%f%n", rope);
		}
		System.out.printf("�ҥH�� %d ��÷���p��@�b",day);
	
	}

}
