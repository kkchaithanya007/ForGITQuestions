package forGIT_Questions;

public class FindEvenOddIndexPositions {
/*
 * 65. Find number of even numbers and odd numbers and store the position of even in other array and same
 * for odd. for ex -> [5 , 10 , 15 , 20] -> no. of even - 2 , odd - 2.
 *  Even position -> [1 , 2] , Odd position -> [0 , 3]
 */
	public static void main(String[] args) {
		int [] arr= {5,10,15,20};
		int size=arr.length,x=0,y=0;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
				x++;
			else
				y++;
		}
		int[] foreven=new int[x];
		int[] forodd=new int[y];
		
		x=0;
		y=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
				{
				foreven[x]=i;
				x++;
				}
			else
				{
				forodd[y]=i;
				y++;
				}
		}
		System.out.println("Positions of even values");
		for(int data:foreven)
			System.out.print(data+" ");

		System.out.println();
		System.out.println("Positions of even values");
		for(int data:forodd)
			System.out.print(data+" ");
	}
}
