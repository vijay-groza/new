package javaProblems;

public class Reversing {

	public static void main(String[] args) {
		String str="ABCD";
		String rev="";
		
		int length = str.length();
		
		for (int i=length-1; i>=0; i--)
		{
			rev=rev+ str.charAt(i);
		}
		System.out.println(rev);
	}
}
