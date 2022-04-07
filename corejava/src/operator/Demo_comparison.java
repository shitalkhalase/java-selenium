package operator;

import java.util.Scanner;

public class Demo_comparison {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		int num2= sc.nextInt();
		
		// == ,!=,>,<,>=,<=
		
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);

	}

}
