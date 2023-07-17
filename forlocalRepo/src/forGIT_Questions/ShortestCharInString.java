package forGIT_Questions;

import java.util.Scanner;

public class ShortestCharInString {
	/*
	 * 40. Find the shortest character in a string. for ex- "bcdaef" -> 'a'.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		String s = sc.nextLine();

		char l, c;
		char[] ch = s.toCharArray();
		int i = ch.length-1, j = 0;
		l = ch[j];
		for (; i > 0; i--) {
			if (ch[i] < l) {
				l = ch[i];
			}

		}
		System.out.println(l);
	}
}
