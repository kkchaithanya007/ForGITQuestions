package forGIT_Questions;

import java.util.Scanner;

public class CheckStringsEqual_Not 
{
	
	/*
	 * 22. Take 2 strings input from user and check whether they are equal or not.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String's:");
		String s1=sc.nextLine(), s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Entered two strings are equal");
		else
			System.out.println("Entered Two Strings are not equal");
		sc.close();
	}
}
