package hw2;
/*5.�j�骺�m��-Prime
	��J�@����ơA��X�Ҧ��p��ε��󪺽�ơC
	��ƪ��w�q���A��]�Ƭ������M 1 
*/
import java.util.Scanner;
public class question05Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@�����");
		int number = scanner.nextInt();
		scanner.close();
		//int number = 7;		//�ؼнd��
		int number0 = 0;	//�аO�D���
		int number1 = 0;	//�аO���
		System.out.printf("%d������Ʀ��G", number);
		for (int j = 2; j <= number ; j++) {			//�`���ܥؼ�number���j��
			number0 = 0;		//�D��ƪ��аO�k0
			number1 = 0;		//�D��ƪ��аO�k0
			for (int i = 2; i < j ; i++) {				//�P�_�M�M�䰣�F1�M�������~���]��

				if (j % i == 0) {						//���]�ƫh���D��ơA�D��ƼаO���аO�� 1 
					number0 = 1;
					break;								//��^�W�譫�s�P�_�A���ϥήɡA�ҡG�Y�n
														//.��6����ơA�|�s4�o�ؤ���㰣���D��Ʀ]�Ƴ���X��
				}else {				//�L�]�ƫh��ƼаO���аO�� 1
					number1 = 1;
				}

			}
			if (number1 == 1) {
				System.out.printf("%d ", j);			//������ơA�h�L�X
			}
		}

	}

}
