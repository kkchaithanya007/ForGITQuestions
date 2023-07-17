package forGIT_Questions;

import java.util.Scanner;

public class ToFindWhitspaces {
/*
 * 36. WAP to count the number of spaces in a string.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String with spaces to count whiteSpaces");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		
		int temp=0;
		for(int i=0;i<ch.length;i++)
		{
		if(Character.isWhitespace(ch[i]))
			temp++;
		}

		System.out.println("No.of whiteSpaces:"+temp);
	}
}
