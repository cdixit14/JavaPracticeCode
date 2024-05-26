package JavaCode;
//MultiLevel Inheritance
class Animal1{
	void eat() {
		System.out.println("eating....");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("baking....");
	}
}
class BabyDog extends Dog1{
	void weep() {
		System.out.println("weeping...");
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();
		d.eat();
		d.bark();
		d.weep();
	}

}
