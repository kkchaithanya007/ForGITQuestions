package forGIT_Questions;

public class MaxInArray {
	/*
	 * 43. Find the maximum element in array.
	 */
	public static void main(String[] args) 
	{
		int max=0,i=0;
		int [] n= {1,2,3,4,9,8,7,6};
		
		max=n[0];
		for(i=n.length-1;i>=0;i--)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		System.out.println("Max element from the int Array:"+max);
	}

}
