///�� Greeting3OccurError �����~�S������ɦV�������Ѫk
public class Greeting2 {
	static String[] greetings = {"Hello", "Hi!", "Good"};
	public static void printGreetings(int i) {
		System.out.println(greetings[i]);					//- i cannot be resolved to a variable
															//- greetings cannot be resolved to a 
		 													//	variable
															//�]��non-static����I�sstatic������
	}
	public static void main(String[] args) {				
		
		try {
			for(int i = 0; i <4 ;i++) {
				printGreetings();
			}
		}catch(ArrayIndexOutOfBoundsException e){		
			System.out.println("Array out of range");
		}catch(Exception e) {			
			System.out.println("Exception happend!");
		}
		
	}

}
