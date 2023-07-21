package forGIT_Questions;

import java.util.Scanner;

public class CheckHighestElement {
/*
 *68. Write a Java program to get the majority element from a given array of integers containing duplicates. 
 *Majority element: A majority element is an element that appears more than n/2 times
 *where n is the size of the array.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element for index position:"+i);
			arr[i]=sc.nextInt();
		}
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
					if(count>(arr.length/2))
						{
						x=-1;
							System.out.println("In the given Array the Element:"+arr[i]+" is more than\n"
									+ "(n/2) times repeated");}
				}
			}
		}
		if(x==0)
			System.out.println("Entered array Don't have any element more than:n/2");
	}
}
