package hw2;
/*
 * 12.	�j��ԭz���m��-Loan
		������H100000�����O�V�Ȧ�B��Q�M�a�U�����ɶU�C�Y�Ȧ檺�~�Q�v��20%�A
		��Q��Q�v��10%�M�a�U������Q�v��1%�C�H�묰���A�p��@�Ӥ��ܤ@�~��C�Ӥ���k�٦h�ֿ��C
*/
public class question12Loan {

	public static void main(String[] args) {
		double p = 100000;					//����
		double pp = 100000;
		double bankRate = 0.2;
		double pawnshopRate = 0.1;			//��Q��Q�v
		double brokenRate = 0.01;			//�a�U������Q�v
		for(int i = 1; i <= 12; i++) {
			System.out.printf("%f = % f * ( 1 + 0.1)%n",p, p);
			p = p * ( 1 + pawnshopRate);
			System.out.printf("%s��A���Q�M��%f%n",i, p);
		}
		System.out.println("=============================================");
		for(int i = 1; i <= 365; i++) {
			pp = pp * ( 1 + brokenRate);
			if ( i % 30 == 0) {
				System.out.printf("%d��ɡA���Q�M�� %f%n",i/30 ,pp);
			}
			
		}

	}

}
