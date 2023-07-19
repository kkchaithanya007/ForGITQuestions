package forGIT_Questions;

import java.util.Scanner;

public class CommonElementsInArray {
	/*
	 * 51. Take two arrays of the same size from the user and print all the common
	 * elements between them. For example, if arr1 -> [1, 2, 3] and arr2 -> [1, 3,
	 * 4], the common element is [1]. There can be multiple common elements.
	 * Condition provided: The arrays provided by the user must be in ascending
	 * order (you do not have to sort).
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Arrays in Ascending Order Only\nEnter Array one SIZE");
		int arr1[] = new int[sc.nextInt()];
		int[] ele = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter element of Array one at index " + i + ":");
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter Array Two");
		int arr2[] = new int[sc.nextInt()];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter element of Array Two at index " + i + ":");
			arr2[i] = sc.nextInt();
		}

		int i = 0, j = 0, x = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				ele[x] = arr1[i];
				x++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}
		}

		System.out.print("Common elements from Given 2-Arrays are:");
		for (int y = 0; y < x; y++) {
			System.out.print(ele[y] + " ");
		}
	}
}
