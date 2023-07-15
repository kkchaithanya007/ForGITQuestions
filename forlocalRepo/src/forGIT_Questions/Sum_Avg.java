package forGIT_Questions;

import java.util.Scanner;

public class Sum_Avg 
{
	/*
	 * 5. Write a program in Java to input 5 numbers from keyboard and find their sum and average.

	 */
	Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Sum_Avg ag=new Sum_Avg();
		System.out.println("Enter 5 digits to get sum and Avg");
		int a=ag.sc.nextInt(),b=ag.sc.nextInt(),c=ag.sc.nextInt(),x=ag.sc.nextInt(),y=ag.sc.nextInt();
		
		int sum= toSum(a,b,c,x,y);
		
		int avg=sum/5;
		System.out.println("The sum="+sum+" and Avg="+avg+" of given 5 digits");
	}
	
	static public int toSum(int x,int y,int z,int a,int b)
	{
		return x+y+z+a+b;
	}
}
