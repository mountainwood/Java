package hw3;

import java.util.Scanner;

/*7.���j��ƪ��m��-Sum
	�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
	ANSWER:
		S(1) �� 1*2=2
		S(2) �� 2*2 + S(1)
		  			  ��1*2
		S(3) �� 3*2 + S(2)
					  �� 2*2 + S(1)
*/
public class question07Sum {
	
	static int sum(int n) {
		if( n == 1) {
			return 2 * n;
		}else {
			return 2*n + sum( n -1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scanner.nextInt();
		
		System.out.printf("sum = %d", sum(n));
		scanner.close();
	}

}
