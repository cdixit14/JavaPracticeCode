package JavaCode;

class Rect
{
	double w,h;
	Rect()  // This is a Constructor which have same name as class, its a class too
	{
		w=5;
		h=4;
	}
	Rect (double a,double b)
	{
		w=a;
		h=b;
	}
	double area()
	{
		return w*h;
	}
	double Perimeter()
	{
	return 2*(w+h);
	}
}

public class ConstRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1,r2;
		r1=new Rect(); // Call of default Constructor
		r2=new Rect(3,4); //Call of Parameterized Constructor
		double a,b,c,d;
		a=r1.area();
		b=r1.Perimeter();
		c=r2.area();
		d=r2.Perimeter();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
