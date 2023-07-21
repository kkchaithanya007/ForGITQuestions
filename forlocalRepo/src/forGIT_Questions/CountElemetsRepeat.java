package forGIT_Questions;

public class CountElemetsRepeat {
/*
 * 67. Print the count of all elements in array. [1 , 2 , 2 , 2 , 3 , 3 ,3 ,3 , 3]
1 appears 1 time
2 appears 3 times
3 appears 5 times
 */
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,2,2,3,3,3,3,3};
		boolean [] b=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(b[i])
				continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
					b[j]=true;
				}
				
			}
			System.out.print("The Element in the Array:"+arr[i]+" ,repeated:"+count+" time's");
			System.out.println();
		}
	}
}
