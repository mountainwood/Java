
public class GenerlaExceptingThrowThrows2 {

	public static void main(String[] args) {
		try {
			method();
		}catch (Exception e) {		//���Ҧ� Exception �����ˡA��B�z�Ҧ��� Exception
			System.out.println("Exception handling in main()");
		}
	}
	public static void method() throws Exception{
		try {
			System.out.println("in method()");
			throw new Exception();
		}catch(Exception e) {		//���B�i�H�ӱ��óB�z���]�� Exception ��error
			System.out.println("Exception handling in method()");
			throw e;		//�Ʊ���ˤ]�B�z�����]�� Exception error
		}
		
	}

}
