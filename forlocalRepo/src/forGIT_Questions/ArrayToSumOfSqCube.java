package forGIT_Questions;

public class ArrayToSumOfSqCube 
{
/*
 * 48. Find sumOfsq of squares and sumOfsq of cubes of all numbers in array. 
 * For ex- [1 , 2 , 3] -> sumOfsq of sq -> 1*1 + 2*2 + 3*3 -> sumOfsq of cubes -> 1*1*1 + 2*2*2 + 3*3*3
 */
	public static void main(String[] args) {
		int n[]= { 1 , 2 , 3 };
		System.out.println("Sum of sq:"+sumOfsq(n));
		System.out.println("Sum of cubes:"+sumOfCube(n));
	}
	static public int sumOfsq(int[] arr)
	{
		int t=0;
		for(int ss:arr)
			t=t+(ss*ss);
		return t;
	}
	
	static public int sumOfCube(int[] arr)
	{

		double t=0;
		for(int ss:arr)
			t=t+(Math.pow(ss, 3));
		return (int)t;
	}
}
