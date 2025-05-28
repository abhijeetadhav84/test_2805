package test_2805;

import java.util.Scanner;

public class factorial {

	
	public static void main(String[] args) {
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value");
//		int fact=sc.nextInt();
		int num=1;
		
		
		for(int i=1; i<=5; i++ ) {
			
			num=num*i;
		}
		
		System.out.println("factorial of "+5+"  is  "+ num);
		
	}
}
