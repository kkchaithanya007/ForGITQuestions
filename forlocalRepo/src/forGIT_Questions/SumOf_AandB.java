package forGIT_Questions;

import java.util.Scanner;

public class SumOf_AandB 
{

	SumOf_AandB(int a,int b)
	{
		int sum = 0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("The SUM of a and b="+sum);
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a and b");
		int a=sc.nextInt(),b=sc.nextInt();
		if(a>b)
		{
			int c=a;
			a=b;
			b=c;
		}
		SumOf_AandB ab=new SumOf_AandB(a,b);
			
	}
}
