package hw2;



public class question01Expression {
	/*迴圈的練習-Expression
	 * 利用 for 迴圈計算 1^2-2^2+3^2-4^2+...+49^2-50^2
*/
	public static void main(String[] args) {
		long result = 0;	//加總結果	
		long number = 50
				;	//執行次數，題目為 50
		long head = -1;		//決定正負值，(-1)^number * number^number
		long headE = -1;	//修正系數
		for (long i = 1; i<= number; i++) {
			head = head * headE;
			result = result + head * i * i;
			//result = result + java.lang.Math.pow(-1, i-1) * java.lang.Math.pow(i, 2);
			//java.lang.Math.pow 做出來是 double型態，所以 result必須用double型態
			//java.lang.Math.pow 做出來是 double型態，所以 result必須用double型態
			//不使用是因為double會產生失真的狀態
		}
		
		
		System.out.println("加總結果為： " + result);

	}

}
