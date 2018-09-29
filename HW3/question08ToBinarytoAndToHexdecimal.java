package hw3;

public class question08ToBinarytoAndToHexdecimal {
	
	static int sq2(int n) {		//計算 2 多少次方
		int result = 1;
		if( n == 0) {
			return result ;
		}else {
			for(int i = 1; i <= n; i++) {
				result = result * 2;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sq2(4));

	}

}
