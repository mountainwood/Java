package hw2;
/*
 * 9.	�j��ԭz���m��-Stars
   �e�X�U�C�T�رƦC���P�P�ϧΡC

 		(1)	*         (2)   * * * * *    (3)    *
          	* *              * * * *          * * *
          	* * *              * * *         * * * * *  
          	* * * *              * *       * * * * * * *
          	* * * * *              *      * * * * * * * * *

 * */


public class StarsNoneSolve {
	static void methodspace(int spacenum, int floorstar){
		String space = " ";
		for(int n = 1; n <= floorstar-spacenum; n++) {
			System.out.printf("%s", space);
		}
	}
	static void methodstar(int starnum) {
		String starplus = "*";
			//for(int p = 1; p <= starnum+1 ;p++) {
				for(int pp = 1; pp <= 1 + 2*starnum; pp ++) {
					System.out.printf("%s", starplus);
				}
		//}
	}
	
	public static void main(String[] args) {

		int floor = 20;		//�h��
		for(int m = 0; m <= floor ; m++) {
			methodspace(m, floor);		//�I�s���b�ť�
			methodstar(m);				//�I�s�P�P����
			methodspace(m, floor);		//�I�s�k�b�ť�
			System.out.printf("%n");	//����
		}
		/* ���ѨM
		String label = "*";	//���L���ϧ�
		int count = 1;

		
		for(int i = 1; i <= 5; i++) {			//�P�w�����������
			System.out.println(label);
			System.out.printf("--%d--%n", i);
			
			if (count == i) {
				System.out.printf("%n");
				System.out.printf("==count%d==%n", count);
				count++;
				i = 1;
				if(count == 6){
					break;
				}

			}
		}
		*/
		
		
		
	}

}
