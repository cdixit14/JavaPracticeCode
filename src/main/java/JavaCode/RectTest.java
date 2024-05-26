package JavaCode;

import java.util.Scanner;

public class RectTest {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of width");
		double w=obj.nextDouble();
		System.out.println("Enter the value of height");
		double h=obj.nextDouble();
		
		double area,perimeter;
		area=w*h;
		perimeter=2*(w+h);
		System.out.println("The area of rect is =" + area);
		System.out.println("The perimeter of rect is =" + perimeter);
	}
}

