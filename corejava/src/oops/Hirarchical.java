package oops;


class Vehicle1{
	
	String type="Car";
	
}
class brend extends Vehicle1{
	
	String brands = "suzuki";
}
class Car1 extends Vehicle1{
	String vname="Kia";
	String coloe="White";
} 

class Price1 extends Vehicle1
{
	String  vehiclenumber ="GJ01 XX XXXX";
}

public class Hirarchical {

	public static void main(String[] args) {
		Price1 obj1 = new Price1();
		System.out.println("car type :" +obj1.type);
		System.out.println("car number :"+obj1.vehiclenumber);
		
		

	}

}
