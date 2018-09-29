package hw62Shape;

public class Circle implements Shape{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return radius * radius;
	}
	
	public double computeCircumference() {
		return 2*radius;
	}
	
}
