package forGIT_Questions;

import java.util.Scanner;

public class BiggerAmong3 
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		
		System.out.println("Given values of a="+a+" ;b="+b+" ;c="+c);
		
		int max=a;
		if(b>max)
			max=b;
		else if (c>max)
			max=c;
		System.out.println("Bigger number among 3 given number's is="+max);
		
	}
}
