package forGIT_Questions;

import java.util.Scanner;

public class No_OfDigitsInNum 
{
	/*
	 * 24. Write a Java program that reads an positive integer and count the number of digits the number has.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to Know it's no.of DIGITS");
		long d=sc.nextLong();
		System.out.println(d);
		if(d<0)
			d=-d;
		long temp,b=0;
			for(temp=d;temp>0;)
		{
			temp=temp/10;
			b++;
		}
		System.out.println("No.of digits in your given number:"+b);
	}
}
