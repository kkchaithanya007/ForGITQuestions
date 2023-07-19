package forGIT_Questions;

import java.util.Scanner;

public class Find2ndSmallest {
/*
 * 53. Write a Java program to find the second smallest element in an array.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;++i)
		{
			System.out.println("Enter value for index position:"+i);
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0],min2=min;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			else if(arr[i]<min2 && arr[i]!=min)
			{
				min2=arr[i];
			}
		}
		System.out.println("2nd Minimum is:"+min2);
	}
}
