package hw3;
/*3.��ƪ��m��-IsPrime
�g�@���boolean isPrime (int n)�ΨӧP�_n�O�_����ơC

 * */
import java.util.Scanner;
public class question03IsPrime {
	static boolean IsPrime (int n){
		int Pcount = 0;
		boolean boo = false;
		for(int i = 1; i <= n; i++) {
			if (n % i == 0 && n != 1) {		//�`���j��A���Ʊq 1 �ˬd�� n-1�A�ӼƭȭY�u��Q 1 �㰣(�w�ư��ۤv)�A�B�ӼƤ����� 1�A�p�ƾ��N�[ 1 
				Pcount++;
			}
		}
		if ( Pcount == 2) {					//�Y�u��Q 1 �㰣�A�p�ƾ��N�� 1 �A�h�i�P�_�����
			boo = true;
			
		}
		return boo ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scanner.nextInt();
		if ( n <= 0) {
			System.out.println("�п�J�����");
		}else {
			if (IsPrime(n) == true) {
				System.out.printf("%d �O���", n);
			}else {
				System.out.printf("%d �D���", n);
			}
		}
		scanner.close();
		

	}

}
