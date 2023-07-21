package forGIT_Questions;

import java.util.HashSet;
import java.util.Set;
/*
 * 66. Find number of unique elements in array. [1 , 2 , 2 , 2 , 3] -> answer 3
 */
public class CountUniqueDigits {

	public static void main(String[] args) {
		int [] arr=new int[] {1,2,2,2,3,0,2};
		Set<Integer> unique=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			unique.add(arr[i]);
		}
		System.out.println(unique.size());
		for(int data:unique)
			System.out.print(data+";");
	}
	
}
