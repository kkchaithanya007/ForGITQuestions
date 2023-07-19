package forGIT_Questions;

public class No_OfEvenOdd 
{
	/*
	 * 54. Write a Java program to find the number of even and odd integers in a given array of integers.
	 */
	public static void main(String[] args) {
		int [] arr= {0,1,2,3,4,5,6,7,8,9};
		int i=0,j=0;
		for(int data:arr)
		{
			if(data%2==0)
			{
				i++;
			}
			else
				j++;
		}
		System.out.println("No.of even Numbers:"+i+" ,No.of odd numbers="+j);
	}
}
