package hw1;

public class question04LeapYear {

	public static void main(String[] args) {
		/*4.��ܩʱԭz���m��-LeapYear
			��J�@�褸�~�A�p2015�C�P�_���~���O�_���|�~�C
			���ܡG�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�C�|�d�~���|�C

		 */
		
		int LeapYear = 8100;		//�~��
		if(LeapYear % 4000 == 0) {		//Year��4000������-���|
			System.out.println("���O��~");
		}else {
			if (LeapYear % 400 == 0) {	//Year��400������-�O��~
				System.out.println("�O��~");
			}else {
				if (LeapYear % 100 ==0) {		//Year��100�����-���O��~
					System.out.println("���O��~");
				}else {
					if (LeapYear % 4 == 0){		//Year��4������-�O��~
						System.out.println("�O��~");
					}else {
						System.out.println("���O��~");	//Year�D4������-���O��~
					}
					
				}
			}
		}

	}

}
