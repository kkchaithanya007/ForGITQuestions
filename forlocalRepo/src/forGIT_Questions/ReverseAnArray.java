package forGIT_Questions;

public class ReverseAnArray {
/*
 * 50. Write a Java program to reverse an array of integer values.
 */
	public static void main(String[] args) {
		int arr[],i=0;
		arr=new int[]{1,2,3,4};
		int r=arr.length,rev[]=new int[r];
		while(i<arr.length)
		{
			r--;
			rev[r]=arr[i];
			i++;
			
		}
		System.out.println("Revrse array is");
		for(int data:rev)
			System.out.print(data+" ");
	}
}
