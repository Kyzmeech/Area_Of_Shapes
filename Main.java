import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int quantityRectangles = 0;
		int quantityCircles = 0;
		int quantityTriangles = 0;
		
		try {
			Scanner in = new Scanner(System.in);
	        System.out.print("Введите количество прямоугольников: ");
			quantityRectangles = in.nextInt();
			System.out.print("Введите количество кругов: ");
			quantityCircles = in.nextInt();
			System.out.print("Введите количество треугольников: ");
			quantityTriangles = in.nextInt();
		}
		catch(Exception e) {
			System.out.print("Неправильный ввод!");
			return;
		}
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
        for (int i=0; i<quantityRectangles; i++){
			shapes.add(new Rectangle ());
        }
        for (int i=0; i<quantityCircles; i++){
    		shapes.add(new Circle ());
            }
        for (int i=0; i<quantityTriangles; i++){	
    		shapes.add(new Triangle ());
        }
        ToConsole(shapes);
	}
	
	static void ToConsole(ArrayList<Shape> shapes) {
        for (Shape f : shapes){
        	double areaShape = f.getArea();
        	String nameShape = f.getName();
        	System.out.println("Площадь  " + nameShape + "  равна  " + areaShape);
        }
	}
}
