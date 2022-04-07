package oopsconsept;
class A{
	void M(){
		System.out.println("hello M");}
	void N() {
		System.out.println("Hello N");
		this.M();
	}
	}



public class ThisMethod {
public static void main(String[] args) {
	A a =new A();
	a.N();
}
}
