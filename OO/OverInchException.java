///與Distance 連結
@SuppressWarnings("serial")
public class OverInchException extends Exception{		//The serializable class OverInchException 
														//does not declare a static final serialVersionUID field of type long
														//選擇第三種debug方法，以後會教理由
	private String msg;
	private int inch;
	
	public OverInchException(String msg, int inch) {
		this.msg = msg;
		this.inch = inch;
	}

	public String getMsg() {
		return msg;
	}

	public int getInch() {
		return inch;
	}
	
	
}
