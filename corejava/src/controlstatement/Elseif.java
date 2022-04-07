package controlstatement;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age :");
		int age = sc.nextInt();
		
		if (age>=60) 
		{
			System.out.println("You are senior citizen");
		}
		else if (age<60 && age>=40) 
		{
			System.out.println("You are middle age");
		}
		else if (age<40 && age>=18) 
		{
			System.out.println("You are Young");
		}
		else if (age<18 && age>=12) 
		{
			System.out.println("You are Teenager");
		}
		else if (age<12 && age>=0)
		{
		System.out.println("You are child");	
		}else 
		{
			System.out.println("Invalid input");
		}
			
		

	}

}
