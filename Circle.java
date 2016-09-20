import java.util.Random;

public class Circle extends Shape {

	private double radius;
	
	public Circle() {
		radius = getRandom(1, 20);
	}

	@Override
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
		}
	
	@Override
	public String getName() {
		return "Circle";
	}
}
