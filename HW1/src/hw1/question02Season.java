package hw1;

public class question02Season {

	public static void main(String[] args) {
		/*2.	��ܩʱԭz���m��-Season
		��J���1~12��A�Q��switch�P�_�۹������u�`�K�B�L�B��B�V�æL�X�C�Y���b���d��h�L�X����J���~���C
		*/
		
		int season = 12;		//�u�`
		switch(season) {		//�P�w����ݩ󪺩u�`
			case 1: System.out.println("�V�u");		//�L�X�V�u
					break;
			case 2: System.out.println("�V�u");
					break;
			case 3: System.out.println("�K�u");		//�L�X�K�u
					break;
			case 4: System.out.println("�K�u");
					break;
			case 5: System.out.println("�K�u");
					break;
			case 6: System.out.println("�L�u");		//�L�X�L�u
					break;	
			case 7: System.out.println("�L�u");
					break;
			case 8: System.out.println("��u");		//�L�X��u
					break;
			case 9: System.out.println("��u");
					break;
			case 10: System.out.println("��u");
					break;
			case 11: System.out.println("��u");
					break;
			case 12: System.out.println("�V�u");		//�L�X�V�u
					break;
			default:System.out.println("��J���~�C");		//��J���~���
		}

	}

}
