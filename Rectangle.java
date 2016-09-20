import java.util.Random;

public class Rectangle extends Shape {

	private double a,b;

	public Rectangle() {
		a = getRandom(1, 20);
		b = getRandom(1, 20);
	}
	 
	@Override
	public double getArea() {
		double area = a * b;
		return area; 
	}
	@Override
	public String getName() {
		return "Rectangle";
	}
}
