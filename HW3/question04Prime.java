package hw3;
/*
 * 4.��ƪ��m��-Prime
	�g�@���int prime (int n)�Ψӧ�X��n�ӽ�ơC
*/
import java.util.Scanner;

public class question04Prime {
	static boolean IsPrime (int n){
		int Pcount = 0;
		boolean boo = false;
		for(int i = 1; i <= n; i++) {
			if (n % i == 0 && n != 1) {
				Pcount++;
			}
		}
		if ( Pcount == 2) {
			boo = true;
			
		}
		return boo ;
	}
	static int Prime(int n) {
		int PrimeCount = 0;					//�ĴX�ӽ�ƪ��p�ƾ�
		for (int i = 2; i <= n; i++) {		//�q 2 �}�l�`�� i �ˬd�A����ƴN�[ 1 
			if (IsPrime(i) == true) {
				PrimeCount++;
			}
		}

		return PrimeCount;					//�^�ǭp�ƭ�
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scanner.nextInt();					//��J�ؼЭ�
		if ( n <= 0) {
			System.out.println("�п�J�����");
		}else {
			if (IsPrime(n) == true) {
				System.out.printf("%d �O���%n", n);						//�O�_�����
				System.out.printf("%d �O�� %d �ӽ��", n, Prime(n));		//�ĴX�ӽ��
			}else {
				System.out.printf("%d �D���%n", n);						//�D���
			}
		}
		
		scanner.close();
		
		//�U�����զ��A��IsPrime(xxx)������ i�A�ڳ]��n�A�ҥH�q�Y�������ΩT�w�ƭȴ���
		/*���~���G
		 *  n:7
			i:2
			PrimeCount:1
			======
			n:7
			i:3
			PrimeCount:2
			======
			n:7
			i:4
			PrimeCount:3
			======
			n:7
			i:5
			PrimeCount:4
			======
			n:7
			i:6
			PrimeCount:5
			======
			n:7
			i:7
			PrimeCount:6
			======
			��6�ӽ��*/
		
		/*���T���G
		 n:7
		i:2
		PrimeCount:1
		======
		n:7
		i:3
		PrimeCount:2
		======
		n:7
		i:5
		PrimeCount:3
		======
		n:7
		i:7
		PrimeCount:4
		======
		��4�ӽ��
		 **/
		/**
		int n = 7;
		int PrimeCount = 0;
		for (int i = 2; i <= n; i++) {
			if (IsPrime(i) == true) {
				PrimeCount++;
				System.out.printf("n:%d%ni:%d%nPrimeCount:%d%n======%n", n, i, PrimeCount);
			}
		}
		System.out.printf("��%d�ӽ��",PrimeCount++);
		**/

	}

}
