package JavaCode;

interface Figure{
	void draw();
	double area();
}
class Rect1 implements Figure{
	double w,h;
	Rect1(){
		w=h=1;
	}
	Rect1(double w,double h){
		this.w=w;
		this.h=h;
	}
	public double area() {
		return w*h;
	}
	double perimeter() {
		return 2*(w+h);
	}
	public void draw() {
		System.out.println("Hello Rect...");
	}
}
class Circle1 implements Figure{
	double r;
	Circle1(){
		r=1;
	}
	Circle1(double r){
		this.r=r;
	}
	public void draw() {
		System.out.println("Hello Circle...");
	}
	public double area() {
		return 3.14*r*r;
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect1 r1=new Rect1(5,4);
		Circle1 c1=new Circle1(10);
		r1.draw();
		r1.area();
		r1.perimeter();
		c1.draw();
		c1.area();
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(c1.area());
	}

}
