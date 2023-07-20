package forGIT_Questions;

import java.util.Scanner;

public class RemoveElementFromArray {
/*
 * 61. Write a Java program to remove a specific element from an array.
for example -> [1 , 2, 3] -> remove 2 then new array should be -> [1 , 3], note -> 
remove all instance of element i.e if user says remove element 2 then remove all 2's from the array.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to remove from the array:");
		  System.out.println("Enter the size of the array:");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
		for(int data:arr)
			System.out.print(data+" ");
		System.out.println();
		System.out.println("Enter a value to remove");
		int r=sc.nextInt(), i=0,x=0;
		int[] arr1=new int[arr.length];
		for(int data:arr)
		{
			if(data!=r)
			{
			arr1[i]=data;
			i++;
			}
				
		}
		for(;x<i;x++)
			System.out.print(arr1[x]+" ");
	}
}
