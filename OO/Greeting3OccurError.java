
public class Greeting3OccurError {
	public void printGreetings() {
		System.out.println(greetings[i]);					//- i cannot be resolved to a variable
															//- greetings cannot be resolved to a 
		 													//	variable
															//因為non-static不能呼叫static的物件
	}
	public static void main(String[] args) {				
		String[] greetings = {"Hello", "Hi!", "Good"};
		try {
			for(int i = 0; i <4 ;i++) {
				System.out.println(greetings[i]);
				printGreetings();
			}
		}catch(ArrayIndexOutOfBoundsException e){		
			System.out.println("Array out of range");
		}catch(Exception e) {			
			System.out.println("Exception happend!");
		}
		
	}

}
