package hw3;
/*5.��ƪ��m��-MersennePrime
	�g�@���boolean mersennePrime (int n)�ΨӧP�_n�O�_��Mersenne��ơC���g�@�{����X�e8��Mersenne��ơC
	���ܡG�Y��ƺ���2P-1=n (p�������)�A�hn��Mersenne Prime�C
	�����G��p=3�ɡA23-1=7�A�G7��Mersenne Prime�C

 * */
/*
 * 4.��ƪ��m��-Prime
	�g�@���int prime (int n)�Ψӧ�X��n�ӽ�ơC
*/
import java.util.Scanner;

public class question05MersennePrime {
	static boolean IsPrime (long n){
		int Pcount = 0;
		boolean boo = false;
		for(long i = 1; i <= n; i++) {		

			if (n % i == 0 && n != 1) {
				Pcount++;
			}
		}
		if ( Pcount == 2) {
			boo = true;
			
		}
		return boo ;
	}
/*	static int Prime(int n) {
		int PrimeCount = 0;					//�ĴX�ӽ�ƪ��p�ƾ�
		for (int i = 2; i <= n; i++) {		//�q 2 �}�l�`�� i �ˬd�A����ƴN�[ 1 
			if (IsPrime(i) == true) {
				PrimeCount++;
			}
		}

		return PrimeCount;					//�^�ǭp�ƭ�
	}*/
	static boolean MersennePrime(long n) {	//MersennePrime �ˬd��
		long p1 = 1;
		long p;
		for (long i = 1; i <= n ; i++) {		//2�� n ���褧�j��
			p1 = p1 * 2;		
			}
		p = p1 - 1;							//�p��X 2^n - 1
		IsPrime (p);						//�P�_�O�_�����
		return IsPrime(p);					//�^�ǬO�_��MersennePrime
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scanner.nextInt();					//��J�ؼЭ�
/*		if ( n <= 0) {
			System.out.println("�п�J�����");
		}else {
			if (IsPrime(n) == true) {
				System.out.printf("%d �O���%n", n);						//�O�_�����
				System.out.printf("%d �O�� %d �ӽ��%n", n, Prime(n));		//�ĴX�ӽ��
			}else {
				System.out.printf("%d �D���%n", n);						//�D���
			}
		}
		*/
		System.out.printf("2^%d �O�_��mersennePrime�G%b%n", n, MersennePrime(n));	//�I�sMersennePrime �ˬd��
		
		
		System.out.println("�Q�n��X��MersennePrime�H");
		int targetN = scanner.nextInt();		//��J���䪺MersennePraime�ƥ�
		long MersenneNum = 0;
		for (long i = 1; i > 0; i++) {			//i �q 1 �}�l��MersennePrime
			if (MersennePrime(i) == true) {		//���@�ӡA�p�ƾ��N�[ 1 
				MersenneNum++;
				System.out.printf("%d ",i);
			}
			if(MersenneNum == targetN) {		//�p�G���˭p�ƾ� == �ؼмƥءA�h���X�j��
				
				break;
			}
		}
		scanner.close();				///*************�ثe�u���� 7 �ӡA�٤����D����䤣��� 8 �ӡA�ץ���long����
										///�쥻������A��Ӭ�M�S����F
	}
}
