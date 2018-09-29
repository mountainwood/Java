
public class Distance {
	private int feet;
	private int inch;
	private static final int Inch_PER_FEET = 12;
	
	public Distance(int feet, int inch) throws OverInchException{
		if (inch >= 12) {
			throw new OverInchException("Inch value over 12, inch = ", inch);
		}
		this.feet = feet;
		this.inch = inch;
	}
		
	public int getFeet() {
		return feet;
	}


	public int getInch() {
		return inch;
	}


	public static void main(String[] args) {
		try {
			Distance d1 = new Distance(5, 7);
			System.out.println("feet = " + d1.getFeet() + ", inch = " + d1.getInch());
			Distance d2 = new Distance(7, 13);
			System.out.println("feet = " + d2.getFeet() + ", inch = " + d2.getInch());
		}catch(OverInchException e) {
			System.out.println(e.getMsg() + e.getInch());
		}

	}

}


