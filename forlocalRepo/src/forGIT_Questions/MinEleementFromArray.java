package forGIT_Questions;

import java.util.Scanner;

public class MinEleementFromArray 
{
	
	/*
	 * 44. Find the minimum element in array.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ***Size*** Integer Elements of the Array");
		int[] ele= new int[sc.nextInt()];
		for(int i=0;i<ele.length;i++)
		{
			System.out.println("Enter element num for :"+(i+1)+"st position");
			ele[i]=sc.nextInt();
					
		}
		int j=0,min=ele[j];
		for(j=ele.length-1;j>0;j--)
		{
			if(ele[j]<min)
				min=ele[j];
		}
		System.out.println("Minimum element of the given Array is:"+min);
	}
	
}
