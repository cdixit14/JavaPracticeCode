package JavaCode;
//Hierarchical Inheritance 
class Animal2{
	void eat() {
		System.out.println("eating....");
	}
}
class Dog2 extends Animal2{
	void bark()
	{
		System.out.println("barking....");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("meowing...");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d=new Dog2();
		Cat c=new Cat();
		d.bark();
		c.meow();
		c.eat();
		
	}

}
