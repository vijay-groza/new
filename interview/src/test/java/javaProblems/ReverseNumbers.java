package javaProblems;

import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Type some numbers:");
		int input = s.nextInt();
	
		
		int rem=0;
		while(input!=0) {
			rem=rem*10+input%10;
			input=input/10;
			
		}System.out.print(rem);
		
/*	int num= 1234;
		
		int rem=0;
		
		while(num!=0)
		{
			rem=rem*10+num%10;
			num=num/10;*/
			
		
		
		
		
		
	}
	}