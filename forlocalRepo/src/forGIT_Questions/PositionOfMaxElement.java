package forGIT_Questions;

public class PositionOfMaxElement {
/*
 * 45. Find position of maximum element in array.
 */
	public static void main(String[] args) {
		int []n= {1,2,3,4,5,8};
		int i=0, max=n[i], index=0;
		for(;i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
				index=i;
			}
		}
		System.out.println("position of maximum element="+max+" in array="+index);
	}
}
