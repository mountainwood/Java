package hw3;
/*6.���j��ƪ��m��-Factorial
	�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
	���ܡGfactorial (n) = n * factorial(n-1)�Afactorial(1)=1
	ANSER:
				factorial(5)
			�@�� 5 * factorial(4)
			�@�@�@�@�@�� 4 * factorial(3)
			�@�@�@�@�@�@�@�@�@�� 3 * factorial(2)
			�@�@�@�@�@�@�@�@�@�@�@�@�@�� 2 * factorial(1)
			�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�� 1
			�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�� retrun
			�@�@�@�@�@�@�@�@�@�@�@�@�@�� 2 * 1 return
			�@�@�@�@�@�@�@�@�@�� 3 * 2 * 1 return
			�@�@�@�@�@�� 4 * 3 * 2 * 1 return
			�@�� 5 * 4 * 3 * 2 * 1 return
*/
public class question06Factorial {
		static int Factorial(int n) {
		
		if( n == 1) {
			return 1;
		}else{								
			return n * Factorial(n-1);
		}

	}
		/*�쥻�N����w�q��
		 * if( n == 1) {
				return 1;}
			else if ( n > 1) {
				return n * Factorial(n-1);}
			�p�����i�H�A�]���A�o�˨èS���w�q n <1 �ɡA�|�^�Ǫ��ƭȡA�ҥH���i�H
		*/
	
	public static void main(String[] args) {
		int n = 5;			//�O��ƦC�� n 
		if ( n >= 0 ) {						//�Y n >= 0�A�i����O��ƦC�B��
		System.out.printf("Factorial(%d) = %d",n , Factorial(n));
		}else {											//�Y n < 0�A���i�B��O��ƦC
			System.out.println("�t�ƫD�O��ƦC��p��");
		}
		
	}

}
