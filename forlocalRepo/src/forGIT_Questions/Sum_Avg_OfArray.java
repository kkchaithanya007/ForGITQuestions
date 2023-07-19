package forGIT_Questions;

import java.util.Scanner;

public class Sum_Avg_OfArray 
{
/*
 * 47. Find sum and average of all elements in array.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer Array -->SIZE");
		int n []=new int[sc.nextInt()];
		for(int i=0;i<n.length;i++)
		{
			System.out.println("Enter an int in the index position:"+i);
			n[i]=sc.nextInt();
		}
		int sum=0;
		for(int sum1:n)
			sum+=sum1;
		System.out.println("The Sum of the Array element's="+sum+" ,and the AVG:"+((int)sum/(n.length)));
	}
}
