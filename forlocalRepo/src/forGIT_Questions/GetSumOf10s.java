package forGIT_Questions;

public class GetSumOf10s {
/*
 * 57. Write a Java program to check if the sum of all the 10's in the array is exactly 30. 
 * Return false if the condition does not satisfy, otherwise true.
 */
	public static void main(String[] args) {
		int[] arr= {10,11,12,10,50,10};
		int i=0,sum=0;
		for(;i<arr.length;i++)
		{
			if(arr[i]==10)
			{
				sum+=arr[i];
			}
		}
		if(sum==30)
		{
			System.out.println("True");
		}
		else
			System.out.println("false");
	}
}
