package forGIT_Questions;

import java.util.Scanner;

public class ForGradeMarks 
{
	
	/*
	 * 14. A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.

	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  marks ");
		int marks=sc.nextInt();
		if(marks>80)
			System.out.println("\n Above 80 - A");
		else if(marks<=80 && marks>60)
			System.out.println("60 to 80 - B");
		else if(marks<=60 && marks>50)
			System.out.println("50 to 60 - C");
		else if(marks<=50 && marks>45)
			System.out.println("45 to 50 - D");
		else if(marks<=45 && marks>25)
			System.out.println("25 to 45 - E");
		else
			System.out.println("Below 25 - F");
		sc.close();
	}
	
}
