package hw2;
/*10.	�j��ԭz���m��-NineNine
   �L�X�U�C�E�E���k��G

   		|	1	2	3	4	5	6	7	8	9
    -----------------------------------------------------------------
     9	|	9	18	27	36	45	54	63	72	81
     8	|	8	16	24	32	40	48	56	64
     7	|	7	14	21	28	35	42	49
     6	|	6	12	18	24	30	36
     5	|	5	10	15	20	25
     4	|	4	8	12	16
     3	|	3	6	9
     2	|	2	4
     1	| 	1

 * */
public class question10NineNine {

	public static void main(String[] args) {
		for(int i = 1; i <= 13; i++) {				//i <= 4 ���e�O�C�L�u |  �v
			switch (i){
				case 1:System.out.printf(" ");
				break;
				case 2:System.out.printf(" ");
				break;
				
				case 3:System.out.printf("| ");
				break;

				case 4:System.out.printf(" ");
				break;
				default:
				System.out.printf("%s ", i-4);		//i == 5�A�}�l�C�L 1, 2, 3, 4, ...., 9
					if(i-4 > 1) {
						System.out.printf(" ");		//i-4 > 2 ����A�ݸɤ@�ӪŮ�A�~�|���
					}
					if(i == 13) {
						System.out.printf("%n");	//i-4 == 13 �A�]�N�O�L�X 9 ����A�n����
					}
			}
		}
		
		System.out.println("--------------------------------");
		
		int total = 0;		//�C�����n����
		for(int i = 9; i > 0; i--) {				//�e��
			System.out.printf("%s |  ", i);
			for(int j = 1; j <= i; j++) {			//��̡Aj ���檺���Ƶ� i �өw
				total = i*j;						//���n����
				System.out.printf("%s ", total);	//�L�X���n
				if( total < 10 && j > 1) {			//�p�G < 10 �A�h�L�@�ӪŮ�A�O���F���
					System.out.printf(" ");
				}
				if( j == i) {						//j �����������N����
					System.out.printf("%n");
				}
			}
		}

	}

}
