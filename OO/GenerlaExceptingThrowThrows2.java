
public class GenerlaExceptingThrowThrows2 {

	public static void main(String[] args) {
		try {
			method();
		}catch (Exception e) {		//為所有 Exception 的父親，能處理所有的 Exception
			System.out.println("Exception handling in main()");
		}
	}
	public static void method() throws Exception{
		try {
			System.out.println("in method()");
			throw new Exception();
		}catch(Exception e) {		//此處可以承接並處理假設為 Exception 的error
			System.out.println("Exception handling in method()");
			throw e;		//希望父親也處理此假設的 Exception error
		}
		
	}

}
