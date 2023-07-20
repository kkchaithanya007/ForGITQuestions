package forGIT_Questions;

import java.util.Scanner;

public class AddElementToArrayAtSpecificIndex {
/*
 * 62. Write a Java program to insert an element (specific position) into an array.
 *for ex-> [1 , 2, 3, 4] insert 6 at index 3 -> [1 , 2 , 3 , 6 , 4]
 */

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of an Array");
			int [] arr=new int[sc.nextInt()];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter value for Array at Index Position:"+i);
				arr[i]=sc.nextInt();
			}
			System.out.println("Your Array data is:");
		for(int data:arr)
			System.out.print(data+" ");
			System.out.println();
			System.out.println("Enter a value and specify it's index position:");
			int j=0,val=sc.nextInt(), index=sc.nextInt();
			int[] arr1=new int[arr.length+1];
			for(int i=0;i<arr.length;i++)
			{
				if(i==index)
				{
					arr1[j]=val;
					j++;
				}
					arr1[j]=arr[i];
					j++;
					
			}
			System.out.println("New array /updated Array:");
			for(int data:arr1)
				System.out.print(data+" ");
		}
}
