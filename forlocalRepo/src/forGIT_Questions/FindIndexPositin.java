package forGIT_Questions;

import java.util.Scanner;

public class FindIndexPositin {
/*
 * 59. PERFORM ALL POSSIBLE QUESTIONS  FROM ABOVE USING ARRAY.
 * 60. Write a Java program to find the index of an array element.
 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,9,8,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer from the Array to know the Index Position");
		
		for(int data:arr)
			System.out.print(data+" ");
		int index=sc.nextInt(),j=-1;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==index)
				{	index=i;
					break;
					}
			else
				j++;
		
		if(j!=-1)
		System.out.println("The Index Position for the Given Element is:"+index);
		else
			System.out.println("The Index Position for the Given Element ="+index+" is not valid");
			
	}
}
