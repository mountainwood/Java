package hw1;

public class question06Equation {

	public static void main(String[] args) {
		/*6.�ܩʱԭz���m��-Equation
			�@���G����{��ax^2+bx+c=0�C��Ja, b, c�T�ȡA�íp���{�����ڡC
			b2-4ac > 0�A����Ӥ��۵�����ڡC
			b2-4ac = 0�A����Ӭ۵�����ڡC
			b2-4ac < 0�A�h�L�X���S����ڡ��C
		*/
		
		/* double result = 0;
		 
		int x = 2;
		int y = 5;
		 
		 ����
		result = java.lang.Math.pow(x, y);
		System.out.println(result); --------> 32.0
		 
		// �}�ڸ�
		result = java.lang.Math.sqrt((double)x);
		System.out.println(result);---------> 1.4142135623730951
		*/
		
		double a = 1;
		double b = -4;
		double c = 4;
		double xEqual = 0;
		double x1 = 0;
		double x2 = 0;
		
		
		if ((java.lang.Math.pow(b,2) - 4*a*c) < 0) {		//�P�_b^2-4ac�O�_ < 0`
			System.out.println("�S�����");		//b^2-4ac < 0 ==> �S�����
		}else {		//b^2-4ac�A1.����0�A2.�j��0
			if ((java.lang.Math.pow(b, 2) - 4 *a * c) == 0) {	//b^2-4ac �O�_����0
				xEqual = (-b) / (2 * a);
				System.out.printf("%8s�A��۵���ڬ� %.2f%n","����Ӭ۵������", xEqual);	//1. b^2-4ac == 0�A����Ӭ۵����
			}else {			//2. b^2-4ac > 0�A����Ӥ��۵������
				x1 = ((-b) + java.lang.Math.sqrt(java.lang.Math.pow(b, 2) - 4 * a *c)) / (2 * a);
				//�Y��ƫ��A�ϥ�int�A�h�L�k�ϥ�java.lang.Math.sqrt���
				x2 = ((-b) - java.lang.Math.sqrt(java.lang.Math.pow(b, 2) - 4 * a *c)) / (2 * a);
				System.out.printf("%13s%f%s%f%n","����Ӥ��۵�����ڡA���O��", x1, "�M", x2);
				System.out.println("���ƫ������G");
				System.out.printf("%s%.0f%2s%.0f%7s%s%s%.0f%n", "(", -b, "+(", java.lang.Math.pow(b, 2) - 4 * a * c, ")^(1/2)",")", "/",  2 * a);
				System.out.printf("%s%.0f%2s%.0f%7s%s%s%.0f%n", "(", -b, "-(", java.lang.Math.pow(b, 2) - 4 * a * c, ")^(1/2)",")",  "/", 2 * a);
			}
		}

	}

}
