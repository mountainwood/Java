package hw2;
/*11.�j��ԭz���m��-Interest
���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C(27�~��)
���ܡG��Q�����GP(1+r*n)    �ƧQ�����GP(1+r)n
P�G�����Ar�G�Q�v�An�G�h�֦~
*/
public class question11Interest {

	public static void main(String[] args) {
		int original = 100000;		//��H������
		double totalA = 0;			//��Q�H���Q���M
		double totalB = 1;			//�ƧQ�H���Q���M�A��l�]�� 1 
		int n =1;					//�~��
		while(n> 0) {
			totalA = 1+ 0.1 * n;		//��Q�H�����Q�M�p��A(1+0.1)*n
			totalB = totalB * 1.05;		//�ƧQ�H�����Q�M�p��A(1+0.05)^n
			
			if(totalB > totalA) {		//�p�G B �����Q�M�W�L A�A�h���X�j��
				break;
			}
			
			n++;
		}
		System.out.printf("%d �~��A ��Q�H A �����Q�M�|�W�L�ƧQ�H B�AA �����Q�M�� %f�AB �����Q�M�� %f�A", n, original*totalA ,original*totalB);

	}

}
