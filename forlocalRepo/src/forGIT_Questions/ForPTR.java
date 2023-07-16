package forGIT_Questions;

import java.util.Scanner;

public class ForPTR 
{
	/*
	 * 17. WAP to find the simple interest. PRT all three will be user input.

	 */
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p,t,r values for simple intrest");
		double p=sc.nextInt(),r=sc.nextInt(),t=sc.nextInt();
		System.out.println("Simple intrest is :"+(p*r*t)/100);
		sc.close();
	}
}
