package JavaCode;
//Method overloading will have same method name but different signature
//Method overriding will have same method name and same signature

class A{
	void show() {
		System.out.println("Hello A");
	}
}
class B extends A{
	void show() {
		System.out.println("Hello B");
	}
}
class E extends B{
	void show() {
		System.out.println("Hello E");
	}
}

public class MethodOveridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj=new E();
		obj.show();
	}

}
