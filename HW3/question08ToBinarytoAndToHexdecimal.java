package hw3;

public class question08ToBinarytoAndToHexdecimal {
	
	static int sq2(int n) {		//�p�� 2 �h�֦���
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
