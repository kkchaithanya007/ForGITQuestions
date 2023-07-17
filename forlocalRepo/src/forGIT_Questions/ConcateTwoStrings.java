package forGIT_Questions;

import java.util.Scanner;

public class ConcateTwoStrings 
{
/*
 * 31. Write a Java program to concatenate a given string to the end of another string. 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two strings to Seen the result concatenate String");
		String s1=sc.nextLine(),s2=sc.nextLine();
		System.out.println(s1.concat(s2));
		
	}
}
