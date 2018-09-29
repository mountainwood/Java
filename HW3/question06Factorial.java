package hw3;
/*6.遞迴函數的練習-Factorial
	寫一遞迴函數int factorial (int n)用來計算1*2*3*…*n的值。
	提示：factorial (n) = n * factorial(n-1)，factorial(1)=1
	ANSER:
				factorial(5)
			　↘ 5 * factorial(4)
			　　　　　↘ 4 * factorial(3)
			　　　　　　　　　↘ 3 * factorial(2)
			　　　　　　　　　　　　　↘ 2 * factorial(1)
			　　　　　　　　　　　　　　　　　↘ 1
			　　　　　　　　　　　　　　　　　↙ retrun
			　　　　　　　　　　　　　↙ 2 * 1 return
			　　　　　　　　　↙ 3 * 2 * 1 return
			　　　　　↙ 4 * 3 * 2 * 1 return
			　↙ 5 * 4 * 3 * 2 * 1 return
*/
public class question06Factorial {
		static int Factorial(int n) {
		
		if( n == 1) {
			return 1;
		}else{								
			return n * Factorial(n-1);
		}

	}
		/*原本將條件定義為
		 * if( n == 1) {
				return 1;}
			else if ( n > 1) {
				return n * Factorial(n-1);}
			如此不可以，因為，這樣並沒有定義 n <1 時，會回傳的數值，所以不可以
		*/
	
	public static void main(String[] args) {
		int n = 5;			//費氏數列的 n 
		if ( n >= 0 ) {						//若 n >= 0，可執行費氏數列運算
		System.out.printf("Factorial(%d) = %d",n , Factorial(n));
		}else {											//若 n < 0，不可運算費氏數列
			System.out.println("負數非費氏數列能計算");
		}
		
	}

}
