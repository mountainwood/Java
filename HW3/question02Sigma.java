package hw3;
/*2.函數的練習-Sigma
寫一函數double my_fun (double x, int n)如下：
提示：利用上題的power(x,n)和課堂上的factorial(n)來完成。

*/
public class question02Sigma {
	static double power(double num, double n ) {		//計算次方的method
		double z = 0;
		if (n < 0) {	//0 次方
			System.out.println("次方請輸入正整數");
		}else {
			if ( n == 0) {	//0次方
				z = 1;
			}else {
				if ( n == 1) {		// 1 次方
					z = num;
				}else {
					z = num;
					for (int i = 1; i <= n-1; i++) {	//2 次方以上
						z = z*num;
					}
					
				}				
			}
		}
		
		return z;
	}
	static long factorial(long m) {		//!的計算	
		long result = 1;				//改成long型態
		
		for (long i = m; i >=1 ; i--) {

			result = result * i;
		}
		return result;
	}
	static double my_fun(double x, int n ) {
		double fun = 0;

		for(int i = 1; i <= n ; i++) {
			fun = fun + power(x, i)/factorial(i);		//i 隨著迴圈改變
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
