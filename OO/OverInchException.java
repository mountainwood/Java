///�PDistance �s��
@SuppressWarnings("serial")
public class OverInchException extends Exception{		//The serializable class OverInchException 
														//does not declare a static final serialVersionUID field of type long
														//��ܲĤT��debug��k�A�H��|�вz��
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
