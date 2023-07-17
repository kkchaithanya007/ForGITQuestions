package forGIT_Questions;

import java.util.Scanner;

public class FindVowels 
{
	/*
	 * 21. Write a Java program that takes the user to provide a single character from the alphabet.
	 *  Print Vowel or Consonant, depending on the user input.
	 */
	public static void main(String[] args) {
		System.out.println("Enter an alphabet");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);	
		
		if (ch==ch-32||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			System.out.println("Entered Character is an VOWEL");
		else
			System.out.println("Entered char is not vowel");
		sc.close();
	}
	
}
