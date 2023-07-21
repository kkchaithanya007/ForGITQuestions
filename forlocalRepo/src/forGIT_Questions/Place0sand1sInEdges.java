package forGIT_Questions;

import java.util.Scanner;

public class Place0sand1sInEdges {
	/*
	 * 69. Write a Java program to segregate all 0s on left side and all 1s on right
	 * side of a given array of 0s and 1s without sorting the array.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element value for index:" + i + "position");
			arr[i] = sc.nextInt();
		}
		int x=0;
		int[] arr1=new int[arr.length];
		for(int i=0,y=arr.length-1;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr1[x]=arr[i];
				x++;
			}
			else if(arr[i]==1)
			{
				arr1[y]=arr[i];
				y--;
			}
				
		}
		for(int data:arr)
		{
			if(data!=0&&data!=1)
				{
				arr1[x]=data;
				x++;
				}
				
		}
		for(int data:arr1)
			System.out.print(data+" ");
	}
}
