package hw3;
/*2.��ƪ��m��-Sigma
�g�@���double my_fun (double x, int n)�p�U�G
���ܡG�Q�ΤW�D��power(x,n)�M�Ұ�W��factorial(n)�ӧ����C

*/
public class question02Sigma {
	static double power(double num, double n ) {		//�p�⦸�誺method
		double z = 0;
		if (n < 0) {	//0 ����
			System.out.println("����п�J�����");
		}else {
			if ( n == 0) {	//0����
				z = 1;
			}else {
				if ( n == 1) {		// 1 ����
					z = num;
				}else {
					z = num;
					for (int i = 1; i <= n-1; i++) {	//2 ����H�W
						z = z*num;
					}
					
				}				
			}
		}
		
		return z;
	}
	static long factorial(long m) {		//!���p��	
		long result = 1;				//�令long���A
		
		for (long i = m; i >=1 ; i--) {

			result = result * i;
		}
		return result;
	}
	static double my_fun(double x, int n ) {
		double fun = 0;

		for(int i = 1; i <= n ; i++) {
			fun = fun + power(x, i)/factorial(i);		//i �H�۰j�����
		}
		
		return fun;
	}
	public static void main(String[] args) {
		double x = 2;
		int n = 4;
		System.out.println(my_fun(x, n));
		//double right;
		//right = 3+ (3*3/2) + ((3*2*1)/6);
		//System.out.print(right);
	}

}
