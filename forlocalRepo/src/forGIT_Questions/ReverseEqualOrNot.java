package forGIT_Questions;

import java.util.Scanner;

public class ReverseEqualOrNot 
{
/*
 * 27. A five-digit number is entered through the keyboard.
 *  Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get reverse of it");
		String n=sc.next();
		int temp=0;
		char[] ch=new char[n.length()];
		
			for(int i=n.length()-1;i>=0;i--)
			{
			ch[temp]=n.charAt(i);
			temp++;
			
			}
			
			System.out.println("The Reverse Number is ");
		for(char data:ch)
		{
			System.out.print(data);
		}
		System.out.println();
		
		String rev=new String(ch);
				if(rev.equals(n))
		System.out.println("So, reverse number and the Actual number equals");
		else
			System.out.println("so, reverse number does not equal to Original/Given number");
	}
}
