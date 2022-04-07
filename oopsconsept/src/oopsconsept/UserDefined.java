package oopsconsept;

import java.util.Scanner;

public class UserDefined {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		findEvenOdd(num);
			
		
		
	}

	private static void findEvenOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			System.out.println("even");
			
		}
		else {
			System.out.println("odd");
		}
	}

}
