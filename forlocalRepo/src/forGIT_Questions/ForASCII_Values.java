package forGIT_Questions;

import java.util.Scanner;

public class ForASCII_Values {
/*
 * 18. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
 */
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter only Single Charater to Know it is a Upper/Lower Case");
	new ForASCII_Values(sc.next());
	}
	
	ForASCII_Values(String a)
	{
		char b=a.charAt(0);
		
		if(b>='a' && b<='z')
		System.out.println("Entered Char:"+b+" is LowerCase Letter");
		else if(b>='A' && b<='Z')
			System.out.println("Entered Char:"+b+" is UpperCase Letter");
		else
		{
			System.out.println("Entered is Invalid -------->Enter again press 'y' to exit press 'n'");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			if(s.equals("y"))
			{
				System.out.println("Enter only Single Charater to Know it is a Upper/Lower Case");
				new ForASCII_Values(sc.next());
			}
			else
				System.out.println("Exited");
			sc.close();
		}
	}
}
