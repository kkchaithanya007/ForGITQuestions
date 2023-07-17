package forGIT_Questions;

import java.util.Scanner;

public class CalculatePofit_Loss 
{
	/*
	 * 26. Write a program to calculate profit or loss. cp and sp provided by user.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CP and SP to know profit or loss");
		int cp=sc.nextInt(),sp=sc.nextInt();
		int profit=sp-cp;
		if(profit>0)
			System.out.println("profit");
		else if(profit<0)
			System.out.println("loss");
		else
			System.out.println("no profit nor loss");
	}
}
