package javaProblems;

import java.util.Scanner;

public class ReverseLetters{
	public static void main (String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter some letters to be reversed:");
	String input = s.next();
	
	
	String rev="";
	int length = input.length();
	
	for(int i=length-1;i>=0;i--) {
		
		rev=rev+input.charAt(i);
		
	}System.out.println(rev);
	
	if (input.equals(rev)) 
	{
		System.out.println("The entered words are palindrome");
	}	
	else 
	{
			System.out.println("The entered words are not palindrome");
	}
	
}
	}