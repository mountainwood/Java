package hw1;

public class question05Refund {

	public static void main(String[] args) {
		/*5.��ܩʱԭz���m��-Refund
		��J�b�Y�ө��ʪ����I���B�P��I���B�C
		��I���B�p�����I���B�A�h�L�X�����B�������C
		��I���B�������I���B�A�h�L�X������������C
		��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
		���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
		
		�����G�Y�R�F132�����ӫ~�A�I1000���A����^�@�i500���A�T�i100���A�@��50���w���A�@��10���w���A�@��5���w���M�T��1���w���C
		*/
		
		
		int requestCost = 100;
		int guestMoney = 116;
		//�r�����B
		int Amount1000 = 1000;
		int Amount500 = 500;
		int Amount100 = 100;
		int Amount50 = 50;
		int Amount10 = 10;
		int Amount5 = 5;
		int Amount1 = 1;
		//�U���B�ҧ�i��
		int refund1000 = 0;
		int refund500 = 0;
		int refund100 = 0;
		int refund50 = 0;
		int refund10 = 0;
		int refund5 = 0;
		int refund1 = 0;
		if (guestMoney < requestCost) {		//�P�_��I���B 1.�����P 2.�j��ε��� ��ڪ��B
			System.out.printf("%4s/%n", "���B����");		//1.���B����
		}else {
			if (guestMoney == requestCost) {		//2-1.�����ڪ��B�P 2-2�j���ڪ��B
				System.out.printf("%4s%n", "�������");		//2-1. �����ڪ��B�A�����
			}else {		//2-2�j���ڪ��B�A�n���
				refund1000 = guestMoney / Amount1000;
				refund500 = guestMoney % Amount1000 / Amount500;
				refund100 = guestMoney % Amount1000 % Amount500 /Amount100;
				refund50 = guestMoney % Amount1000 % Amount500 % Amount100 / Amount50;
				refund10 = guestMoney % Amount1000 % Amount500 % Amount100 % Amount50 / Amount10;
				refund5 = guestMoney % Amount1000 % Amount500 % Amount100 % Amount50 % Amount10 / Amount5;
				refund1 = guestMoney % Amount1000 % Amount500 % Amount100 % Amount50 % Amount10 % Amount5 /Amount1;
				System.out.printf("��^�r�����G%d�i1000���r���A%d�i500���r���A%d�i100���r���A%d��50���w���A%d��10���w���A%d��5���w���A%d�����w��%n"
						,refund1000 ,refund500, refund100, refund50, refund10, refund5, refund1);
			}
				
			}
		
		
			

	}

}
