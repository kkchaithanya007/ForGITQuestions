package forGIT_Questions;

public class MinElementInArray {
/*
 * 46. Find position of minimum element in array.
 */
	public static void main(String[] args) {
		int [] ele;
		ele= new int[]{1,5,2,4,3};
		
		int i=0,min=ele[i] ,index=i;
		while(i<ele.length)
		{
			if(ele[i]<min)
			{
				min=ele[i];
				index=i;
			}
			i++;
		}
		System.out.println("Minimum element from Array="+min+" and index position="+index);
	}
}
