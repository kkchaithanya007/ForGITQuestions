package forGIT_Questions;

/*
 * 15. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1

 */

import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String[] args) {

		{
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			int absoluteValue;
			if (number < 0) {
				absoluteValue = -number;
			} else {
				absoluteValue = number;
			}

			System.out.println("The absolute value of " + number + " is: " + absoluteValue);

			scanner.close();
		}
	}

}
