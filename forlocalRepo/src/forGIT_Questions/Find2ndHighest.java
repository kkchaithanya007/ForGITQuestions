package forGIT_Questions;

import java.util.Scanner;

public class Find2ndHighest {
/*
 * 52. Write a Java program to find the second largest element in an array.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int [] s=new int[sc.nextInt()];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter value for +"+i+" Index Position");
			s[i]=sc.nextInt();
		}
		int max,j=0,x=0;
		max=max(s);
		
		int[] arr=new int[s.length-1];
		
		while( x<arr.length)
		{
			if(s[j]!=max)
			{
				arr[x]=s[j];
				x++;
			}
			j++;
		}
		
		int max2=max(arr);
		System.out.println("2nd max="+max2);
		
		
		
	}
	static int max(int [] arr)
	{
		int max=arr[0],i=0;
		while(i<arr.length)
		{
			if(arr[i]>max)
				max=arr[i];
			i++;
		}
		return max;
	}
}
