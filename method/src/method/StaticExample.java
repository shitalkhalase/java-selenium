package method;
class Student{
	int rollno;
	String name;
	static String collage;
	
	static  void change() {
			collage="JSPM";
				
			}
	Student(int r,String n){
		rollno=r;
		name=n;
		
	}
		
				
void display() {
		System.out.println(rollno+" "+name+" "+collage);
	}
}
public class StaticExample {
	public static void main(String[] args) {
		Student.change();
		Student s1= new Student(101,"Shitsl");
		Student s2= new Student(102,"Shitsl2");
		s1.display();
		s2.display();
	}
	

}
