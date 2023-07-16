package forGIT_Questions;

import java.util.Scanner;

public class ToKnowASCIIValues 
{
	/*
	 * 19. Write a program to input any character and check whether it is alphabet, digit or special character.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an ASCII value");
		char x=sc.next().charAt(0);
		if(x>='a' && x<='z' || x>='A' && x<='Z' )
		{
			System.out.println("Alphabet");
		}
		if(x>='0' && x<='9')
		{
			System.out.println("Digit");
		}
		else
			System.out.println("Special Characters");
		
	}
}
