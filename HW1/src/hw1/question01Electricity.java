package hw1;

public class question01Electricity {

	public static void main(String[] args) {
		/*1.	��ܩʱԭz���m��-Electricity
				��J��إιq�M�׼ơA�p��X��ú���q�O�C
				�q�O���q�ϥβ֭p�覡�ӭp��q�O�A���u�~�ιq�ήa�x�ιq�C
                   	   �a�x�ιq        �u�~�ιq
   				240��(�t)�H�U			0.15��			0.45��
				241~540(�t)��   		0.25��			0.45��
				541�ץH�W        	0.45��			0.45��
		*/
		
		//String type = "industry"; //type.equals("industry")	 	//industry �A�Ϥ��a�x�H�Τu�~�ιq
		int type = 0 ;						//�ιq���O�A0���a�x�A1���u�~
		double electricity = 541;			//�ιq�׼�
		double industryDegree = 0.45;		//�u�~�ιq�O�v
		double homeDegree240 = 0.15;		//�a�x�ιq240�ץH�U
		double homeDegree241540 = 0.25;		//�a�x�ιq241~540�פ���
		double homeDegree541 = 0.45;		//�a�x�ιq541�ץH�W
		double value = 0;					//�q�O�`�B
		if (type == 1) {			//�u�~�ιq���O
									//switch�L�k�ϥ�boolean�A�u��ϥΥ|�j�����O�A�Y�n��boolean�A�����ϥα`�ƫ��ܼƩ�char
			value = electricity * industryDegree;	//�p��q�O�A�q�O = �O�v * �׼� 
			System.out.printf("�u�~�׼Ƭ��G%f�סA�q�O�`�p%.4f��%n", electricity, value);	//��ܤu�~�ιq�׼�

		}else{		//�a�x�ιq
			if (electricity <= 240) {		//�׼Ʀb 240 �H�U
				value = electricity * homeDegree240;	//�p��q�O�A�q�O = �O�v * �׼�
			}else {		//�׼Ʀb 241 �H�W 
				if (electricity <= 540){	//�׼Ʀb 241 �� 540 ����
					value = 240 * homeDegree240 + (electricity -240) * homeDegree241540 ;					
				}else{	//�׼Ʀb541�H�W
					value = 240 * homeDegree240 + 300 * homeDegree241540 + (electricity - 540 ) * homeDegree541;
				}
				
			}
			System.out.printf("�a�x�׼Ƭ��G%f�סA�q�O�`�p%.4f��",electricity, value);	//��ܮa�x�ιq�׼�
			
		}

	}

}
