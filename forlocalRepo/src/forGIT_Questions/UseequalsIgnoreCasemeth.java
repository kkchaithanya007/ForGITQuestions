package forGIT_Questions;

import java.util.Scanner;

public class UseequalsIgnoreCasemeth {
/*
 * 32. Check two strings are equal or not. IGNORE THE CASE.
for ex- "abcde" is same as "AbCdE".
 */
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Two Strings");
		UseequalsIgnoreCasemeth n=new UseequalsIgnoreCasemeth();
		String s1=n.sc.nextLine(), s2=n.sc.nextLine();
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
