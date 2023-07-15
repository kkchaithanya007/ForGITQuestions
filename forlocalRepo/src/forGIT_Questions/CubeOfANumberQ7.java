package forGIT_Questions;

import java.util.Scanner;

public class CubeOfANumberQ7 
{
	/*
	 * 7. WAP to print cube of a number (user input).
	 */
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Give an I/P to get Cube of that a number ");
		int s=sc.nextInt();
		//System.out.println("For s="+s+" Cube is ="+s*s*s);
		System.out.println(Math.pow(s, 3));
	}
}
