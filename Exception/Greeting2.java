///解 Greeting3OccurError 的錯誤沒有物件導向概念的解法
public class Greeting2 {
	static String[] greetings = {"Hello", "Hi!", "Good"};
	public static void printGreetings(int i) {
		System.out.println(greetings[i]);					//- i cannot be resolved to a variable
															//- greetings cannot be resolved to a 
		 													//	variable
															//因為non-static不能呼叫static的物件
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
