package forGIT_Questions;

import java.util.Scanner;

public class AreaOfTriangle 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height");
		int b=sc.nextInt(),c=sc.nextInt();
		System.out.println("Area of Triangle="+((double)0.5*(b*c))+" with base="+b+" and height="+c);
		sc.close();
		
	}
	
}
