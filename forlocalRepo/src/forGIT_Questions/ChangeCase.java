package forGIT_Questions;

import java.util.Scanner;

public class ChangeCase 
{
	/*
	 * 20. Convert lowerCase to Upper and vice versa.
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet to make it capital/small");
		char s=sc.nextLine().charAt(0);
		char convertedCase;
		
		if(s>='a'&&s<='z')
		{
			convertedCase=(char)(s-32);
			System.out.println("convertedCase letter :"+convertedCase);
		}
		else if(s>='A'&&s<='Z')
		{
			convertedCase=(char)(s+32);
			System.out.println("convertedCase letter :"+convertedCase);
		}
		else
			System.out.println("Invalid Run again");
		sc.close();
	}
}
