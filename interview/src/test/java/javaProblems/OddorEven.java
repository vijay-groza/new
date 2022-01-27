package javaProblems;

import java.util.Scanner;

public class OddorEven {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("type a number:");
		int input = s.nextInt();
		
		if(input%2==0) {
			System.out.println("the given number is even");
			
		}
		else
		{
			System.out.println("the given number is odd");
		}
	
	
	}

}
