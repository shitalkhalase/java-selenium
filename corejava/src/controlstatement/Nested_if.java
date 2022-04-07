package controlstatement;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		
		if (num <=100) 
		{
			if (num>=50)
			{
			System.out.println("Your number is Greater  than 50");	
			}else {
				System.out.println("Your number is less than 50");
			}
		}else {
			System.out.println("Your number is greater than 100");
		}

	}

}
