package JavaCode;

abstract class Shape{
	abstract void draw();
	abstract double area();
}
class Rect2 extends Shape{
	double w,h;
	
	Rect2(){
		w=h=1;
	}
	Rect2(double w,double h){
		this.w=w;
		this.h=h;
	}
	double area() {
		return w*h;
	}
	void draw() {
		System.out.println("Hello Rect...");
	}
	double perimeter() {
		return 2*(w+h);
	}
}
class Circle extends Shape{
	double r;
	Circle(){
		r=1;
			}
	Circle(double r){
		this.r=r;
	}
	double area() {
		return 3.14*r*r;
	}
	void draw() {
		System.out.println("Hello Circle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect2 r1=new Rect2(5,4);
		Circle c1=new Circle(10);
		r1.draw();
		c1.draw();
		r1.area();
		c1.area();
		r1.perimeter();
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(c1.area());
		
	}

}
