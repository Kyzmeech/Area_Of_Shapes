import java.util.Random;


public class Triangle extends Shape {
	
	 private double a, b, ab_angle;
	 
	 public Triangle (){
		a = getRandom(1, 20);
		b = getRandom(1, 20);
		ab_angle = getRandom(1, 179);
	 }
	 
	@Override
	public double getArea() {
		double c = getThirdSide(a, b, ab_angle);
		double p=(a + b + c)/2;
		double area =Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	
	@Override
	public String getName() {
		return "Triangle";
	}
	
	private double getThirdSide(double side1, double side2, double angleBetween)
	{				
		double angle = Math.toRadians(angleBetween);
		return Math.sqrt(side1*side1 + side2*side2 - 2*side1*side2*Math.cos(angle));
	}
}
