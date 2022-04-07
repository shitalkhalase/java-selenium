package oops;



class Employee {
	
	int empid =101;
	String empname = "Shital";
	
	
}






public class SingleInheritance extends Employee{

	String desiganation = "Softaware Tester";
	
	void showdata() {
		
		System.out.println("Employee ID: " +empid);
		System.out.println("Name :" +empname);
		System.out.println("Desgination: "+desiganation );
		
	}

	
	
	
	public static void main(String[] args) {
		SingleInheritance si =new SingleInheritance();
	
		si.showdata();

	}

}
