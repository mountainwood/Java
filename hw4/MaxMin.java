package hw4;



/*
 * 1.蝴皚絤策-MaxMin
	ㄆ盢10计竚蝴皚いだт10计い程㎝程
*/
public class MaxMin {

	public static void main(String[] args) {
		int[] array1 = new int[]{5,7,3,2};
		//int[] array2 = new int[4];
		for(int i = 0;  i < array1.length; i++) {
			for(int j = 0 ; j < array1.length; j++) {
				if(array1[i] < array1[j]) {
					int m = array1[i];
					//System.out.println(array1[i]);
					int n = array1[j];
					//System.out.println(array1[j]);
					array1[i] = n;
					array1[j] = m;
				}
			}
			
		}
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.printf("程琌%d程琌%d",array1[0], array1[array1.length-1]);
	}

}
