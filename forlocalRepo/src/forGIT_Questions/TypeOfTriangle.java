package forGIT_Questions;

import java.util.Scanner;

public class TypeOfTriangle 
{
	/*
	 * 25. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.
	 */
	public static void main(String[] args) {
		System.out.println("Enter 3-sides of a Triangle to Know its Type");
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt(),s2=sc.nextInt(),s3=sc.nextInt();
		if (s1>0 && s2>0&& s3>0)
		{
			if(s1==s2 &&s1==s3)
				System.out.println("Entered 3-sides represent a EQUilateral TRIANGLE");
			else if(s1==s2 || s1==s3 ||s2==s3)
				System.out.println("Entered 3-sides represent a Isosceles TRIANGLE");
			else
				System.out.println("Entered 3-sides represent a Scalene TRIANGLE");
		
		}
		else
			System.out.println("Entered sides or not valid pzz try again");
		sc.close();
	}
}
