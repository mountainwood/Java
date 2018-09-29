
public class Greeting1 {
	String[] greetings = {"Hello", "Hi!", "Good"};
	public void printGreetings(int i) {
		System.out.println(greetings[i]);					//- i cannot be resolved to a variable
															//- greetings cannot be resolved to a 
		 													//	variable
															//因為non-static不能呼叫static的物件
	}
	public static void main(String[] args) {				
		Greeting1 g= new Greeting1();						//建立 (new) 一個物件，讓non-static可以使用 static 
		try {
			for(int i = 0; i <4 ;i++) {
				g.printGreetings(i);
			}
		}catch(ArrayIndexOutOfBoundsException e){		
			System.out.println("Array out of range");
		}catch(Exception e) {			
			System.out.println("Exception happend!");
		}
		
	}

}
