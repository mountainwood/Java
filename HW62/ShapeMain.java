package hw62Shape;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c = new Circle(20);
		System.out.printf("�ꭱ�n���G%.2f�k || ��P���G%.2f�k%n", c.computeArea(), c.computeCircumference());
		Rectangle r = new Rectangle(20);
		System.out.printf("����έ��n���G%.2f || ����ΩP�����G%.2f%n", r.computeArea(), r.computeCircumference());
	}

}
