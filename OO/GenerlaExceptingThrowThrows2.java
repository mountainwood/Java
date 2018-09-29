
public class GenerlaExceptingThrowThrows2 {

	public static void main(String[] args) {
		try {
			method();
		}catch (Exception e) {		//┮Τ Exception 克矪瞶┮Τ Exception
			System.out.println("Exception handling in main()");
		}
	}
	public static void method() throws Exception{
		try {
			System.out.println("in method()");
			throw new Exception();
		}catch(Exception e) {		//矪┯钡矪瞶安砞 Exception error
			System.out.println("Exception handling in method()");
			throw e;		//辨克矪瞶安砞 Exception error
		}
		
	}

}
