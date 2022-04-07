package encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e=new Employee();
		 
		e.setId(111);
		e.setName("shital");
		e.setAddress("pune");
		e.setCompany("Maxgen");
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" "+e.getCompany());
	}

}
