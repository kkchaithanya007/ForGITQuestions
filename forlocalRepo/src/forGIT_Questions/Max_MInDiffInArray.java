package forGIT_Questions;

import java.util.Scanner;

public class Max_MInDiffInArray {
/*
 * 55. Write a Java program to get the difference between 
 * the largest and smallest values in an array of integers.
 *  The length of the array must be 1 and above.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Array must be 1 and Above");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value for index position-"+i);
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=max;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Difference b/w largest and smallest values in an array of integers"+(max-min));
		
	}
}
