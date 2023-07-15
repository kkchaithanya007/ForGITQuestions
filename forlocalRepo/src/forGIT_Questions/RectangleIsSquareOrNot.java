package forGIT_Questions;

import java.util.Scanner;

public class RectangleIsSquareOrNot 
{
	
	//11. Take values of length and breadth of a rectangle from user and check if it is square or not.
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and breadth of a Rectangle");
	int a=sc.nextInt(),b=sc.nextInt();
	if(a==b)
		System.out.println("Given rectangle parameter represent a Square ");
	else
		System.out.println("Given rectangle parameter does represent a Square ");
	
	sc.close();
	}
}
