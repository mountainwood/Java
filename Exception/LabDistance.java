///¤W½Ò¼gªº¿ù»~¼gªk
public class LabDistance {
	public class Distance(String msg, int inch) {
		private String msg;
		private int inch;
		
		Distance(){
		this.msg = msg;
		this.inch = inch;
		}
		
	}
	public static void main(String[] args) {
		try {
			Distance("5", 13);
		}catch(Exception e) {
			System.out.println("Over inch");
		}

	}
	public class OverInchException extends Exception{
		private String msg;
		private int inch;
		public OverInchException(String msg, int inch) {
			this.msg = msg;
			this.inch = inch;
		try {
			throw Distance;
		}catch(OverInchException e){
			System.
		}
		}
	}

}
