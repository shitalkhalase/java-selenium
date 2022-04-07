package oopsconsept;
class Student{
	int id;
	String name;
}
public class ExampleClassObject {
	public static void main(String[] args) {
		
	
	Student s= new Student();        ///class and object using reference variable
	s.id=111;
	s.name="Shital";
	System.out.println(s.id);
	System.out.println(s.name);

}
}