package hw2;



public class question01Expression {
	/*�j�骺�m��-Expression
	 * �Q�� for �j��p�� 1^2-2^2+3^2-4^2+...+49^2-50^2
*/
	public static void main(String[] args) {
		long result = 0;	//�[�`���G	
		long number = 50
				;	//���榸�ơA�D�ج� 50
		long head = -1;		//�M�w���t�ȡA(-1)^number * number^number
		long headE = -1;	//�ץ��t��
		for (long i = 1; i<= number; i++) {
			head = head * headE;
			result = result + head * i * i;
			//result = result + java.lang.Math.pow(-1, i-1) * java.lang.Math.pow(i, 2);
			//java.lang.Math.pow ���X�ӬO double���A�A�ҥH result������double���A
			//java.lang.Math.pow ���X�ӬO double���A�A�ҥH result������double���A
			//���ϥάO�]��double�|���ͥ��u�����A
		}
		
		
		System.out.println("�[�`���G���G " + result);

	}

}
