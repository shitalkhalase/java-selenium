package inheritance;

class Animal{
	void eat() {
		System.out.println("eating..");
	}
}
class Dog extends Animal{
	void run() {
		System.out.println("running..");
	}
}
class BabyDog extends Dog{
	void jumping() {
		System.out.println("jumping..");
	}
}
class Mummy extends BabyDog{
   void care() {
	   System.out.println("caring..");
   }
}
public class SingleInheritance {
	public static void main(String[] args) {
		Mummy m=new Mummy();
		m.care();
		m.eat();
		m.jumping();
		m.run();
	}

}
