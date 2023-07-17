package forGIT_Questions;

import java.util.Scanner;

public class User_subString 
{
	
	/*
	 * 23. Take a string and 2 range (l , r) and print the subsrting.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to make it two different Strings");
		String s1=sc.nextLine(),s2;
		System.out.println("Enter your range for subString");
		int a=sc.nextInt(),b=sc.nextInt();
		s2=s1.substring(a,b);
		System.out.println("Your SubString for range:"+a+"to"+b+" is :"+s2);
	}
}
