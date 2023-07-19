package forGIT_Questions;

import java.util.Scanner;

public class CheckValuePresentInArray {
/*
 * 49. Write a Java program to test if an array contains a specific value.
 */
	public static void main(String[] args) {
		int [] arr= {1,4,2,5,3,6,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to see present in Array or Not");
		int x=sc.nextInt(),j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("present");
				j++;
			}
		}
		if(j==0)
			System.out.println("Entered value not present in Array");
			
	}
}
