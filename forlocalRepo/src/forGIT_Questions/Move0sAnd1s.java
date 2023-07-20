package forGIT_Questions;

public class Move0sAnd1s {
/*
 * 64. Given a sorted array(ascending) with only 0's and 1's move 
 * all zeros to right end and all 1's to left end. for ex -> [0 , 0 , 0 , 1 , 1] -> [1 , 1 , 0 , 0 , 0]
 */
	public static void main(String[] args) 
	{
		int [] arr = {1,0,3,4,0,1,0,0,1};
		int [] arr1=new int[arr.length];
		int j=0;
		for(int i1=arr.length-1,j1=i1;i1>=0;i1--)
		{
			if(arr[i1]==1)
			{
				arr1[j1]=arr[i1];
				j1--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		System.out.println(j);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0 && arr[i]!=1)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr1[i]+" ");
		
	}
}
