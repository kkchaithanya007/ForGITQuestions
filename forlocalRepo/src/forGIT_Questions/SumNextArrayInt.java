package forGIT_Questions;

public class SumNextArrayInt 
{
	/*
	 * 70. WAP in java to print the sum of all pairs in array. Extra condition last and first element 
	 * will also be considered. for ex -> [1 , 2 , 3 ,4] -> [3 , 5 , 7 , 5]
	 *explanation -> 1 + 2 gives 3 , 2 + 3 gives 5 , 3 + 4 gives 7 , 4 + 1 gives 5.
	 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] arr1= new int[arr.length];
		for(int i=0,j=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
				arr1[j]=arr[i]+arr[0];
			}
			else
			arr1[j]=arr[i]+arr[i+1];
			j++;
		}
		for(int data:arr1)
			System.out.print(data+" ");
	}
}
