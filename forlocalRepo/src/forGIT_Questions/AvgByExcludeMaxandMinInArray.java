package forGIT_Questions;

public class AvgByExcludeMaxandMinInArray {
/*
 * 56. Write a Java program to compute 
 * the average value of an array of integers except the largest and smallest values.
 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7};
		int max=arr[0],min=max;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];

			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Avg of array excluding largest and smallest");
		int i=0,j=0,x=0;
		for(;i<arr.length;i++)
			if(arr[i]!=max && arr[i]!=min)
				{
				j+=arr[i];
				x++;
				}
		System.out.println((double)j/x);
	}
}
