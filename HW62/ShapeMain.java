package hw62Shape;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c = new Circle(20);
		System.out.printf("圓面積為：%.2fπ || 圓周為：%.2fπ%n", c.computeArea(), c.computeCircumference());
		Rectangle r = new Rectangle(20);
		System.out.printf("正方形面積為：%.2f || 正方形周長為：%.2f%n", r.computeArea(), r.computeCircumference());
	}

}
