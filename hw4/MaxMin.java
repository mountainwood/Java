package hw4;



/*
 * 1.�@���}�C���m��-MaxMin
	�ƥ��N10�ӼƦr�m��@���}�C���A���O��X10�ӼƦr���̤j���ȩM�̤p���ȡC
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
		System.out.printf("�̤p�O�G%d�A�̤j�O�G%d",array1[0], array1[array1.length-1]);
	}

}
