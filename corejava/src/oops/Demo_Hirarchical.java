package oops;
class Animal{
	
	
	void eat () {
		System.out.println("Eating'");
	}
}

class Dog extends Animal{
	
	void bark () {
		System.out.println("barking");
	}
}

class Cat extends Animal {
	void run ()
{
System.out.println("cat is running");	
}
	
	
	}

public class Demo_Hirarchical {

	
	
	
	public static void main(String[] args) {
		
Cat c = new Cat();

c.eat();
c.run();
	}

}
