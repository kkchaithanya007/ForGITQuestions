package forGIT_Questions;

public class CheckElements {
/*
 * 63. Write a Java program to find a missing number in an array.
 *  Where the numbers count starts from 1 to n. Let us consider array of size 6 -> [1 , 2 , 4 , 5 ,6 ,7]
 *here the missing number is 3 because after 2, 3 comes.
 *NOTE -> there will be only 1 missing element in the array, 
 *user will be bound to provide that type of array only and if there is no missing element print -1.
 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int x=arr[0],j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				j++;
			}
			x++;
		}
		if(arr.length==j)
			System.out.println("-1");
		else
			System.out.println("Element is missing");
	}
}
