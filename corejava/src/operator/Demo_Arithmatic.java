package operator;

import java.util.Scanner;

public class Demo_Arithmatic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		int num2= sc.nextInt();
		
		
	 int add= num1+num2;
	 int sub= num1-num2;
	 int mul=num1*num2;
	 int div=num1/num2;
	 int mod=num1%num2;
	 
	 
	 System.out.println("Addition is "+add);
	 System.out.println("Subtraction is "+sub);
	 System.out.println("Multiplication is "+mul);
	 System.out.println("division is "+div);
	 System.out.println("Mode is "+mod);
	 System.out.println(++num1);
	 System.out.println(--num2);

	}

}
