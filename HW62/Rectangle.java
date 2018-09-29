package hw62Shape;

public class Rectangle implements Shape{
	private double line;
	
	Rectangle(double line){
		this.line = line;
	}

	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}
	
	public double computeArea() {
		return line * line;
	}
	
	public double computeCircumference() {
		return line * 4;
	}
	
}
