package forGIT_Questions;

public class CheckTwoElementsPresentOrNot {
/*
 * 58. Write a Java program to check if an array of integers contains two specified elements 65 and 77.
 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,65,77,90};
		int i=0,j=0;
		for(int data:arr)
		{
				if(data==65)
					i++;
				if(data==77)
					j++;
		}	
		if(i>0 && j>0)
			System.out.println("Integer array contains two specified elements");
		else
			System.out.println("Integer array Does not--->contains two specified elements");
	}
}
