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
public class question09Stars {
	static void methodspace(int spacenum, int floorstar){		//��J�e�C�@�h�ɡA�ݭn���ťռƥإH���`�h��
		String space = " ";
		for(int n = 1; n <= floorstar-spacenum; n++) {
			System.out.printf("%s", space);
		}
	}
	static void methodstar(int starnum) {						//��J�P�P���ƥ�
		String starplus = "*";

			for(int pp = 1; pp <= 1 + 2*starnum; pp ++) {
				System.out.printf("%s", starplus);
			}

	}
	public static void main(String[] args) {
		String star1 = " * * * * *";							//�ťե[�P�P
		for(int i = star1.length(); i >= 0; i = i-2) {			//�q��m10�}�l���^�L�A�C���L�@�Ӫťե[�@�ӬP�P
			System.out.printf("%s%n", star1.substring(0,i));
		}
		System.out.println("=========================================");
		
		String star2 = "* * * * * ";
		for(int j =0; j <= star2.length(); j = j+2) {			//�P�P�[�ť�
			System.out.printf("%s%n", star2.substring(0,j));	//�q��m 0 �}�l���^�L�A�C���L�@�ӬP�P�[�@�Ӫť�
		}
		
		System.out.println("=========================================");
		
		int floor = 3;		//�h��
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
