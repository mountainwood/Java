
public class Greeting {

	public static void main(String[] args) {
		String[] greetings = {"Hello", "Hi!", "Good"};
		try {
			for(int i = 0; i <4 ;i++) {
				System.out.println(greetings[i]);
				/*�X�{�H�U���G�P���~exception
				 * Hello
					Hi!
					Good
					Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
						at Greeting.main(Greeting.java:8)
				 * */
			}
		}catch(ArrayIndexOutOfBoundsException e){		//�W����Fjava.lang.ArrayIndexOutOfBoundsException�T��
														//���� catch ����A��print�U��
			System.out.println("Array out of range");
		}catch(Exception e) {			//���Ҧ�Exception�����ˡA�Y�O�e���Ҧ�exception��������error�A�N�|���榹��
			System.out.println("Exception happend!");
		}
		
	}

}
