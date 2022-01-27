package javaProblems;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateWords{

	public static void main (String[]args) {

		String [] programs={"java","selenium","python","ruby","java"};

		HashSet<String>l=new HashSet<String>();

		for(String s:programs) {
			boolean addedPgms = l.add(s);

			if(addedPgms==false) {
				System.out.println("the duplicate element is: " +s);
			}			

		}System.out.println("the other elements are :"+l);



	}



}


