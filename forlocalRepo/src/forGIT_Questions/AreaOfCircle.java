package forGIT_Questions;

import java.util.Scanner;

public class AreaOfCircle 
{
	
	//9. Find the area of the circle. Take radius as input from user.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle r:");
		int r=sc.nextInt();
		double area=(Math.PI*(Math.pow(r, 2)));
		System.out.println("Area of the CIRCLE:"+area);
	}
	
}
