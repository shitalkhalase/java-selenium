package oopsconsept;
class Stud{  
	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  
	} 

public class ExampleObjectThroughMethod {
	public static void main(String args[]){  
		  Stud s1=new Stud();  
		  Stud s2=new Stud();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
		 }  
		}  