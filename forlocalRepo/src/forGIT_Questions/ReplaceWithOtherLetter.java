package forGIT_Questions;

import java.util.Scanner;

public class ReplaceWithOtherLetter {
/*
 * 33. Write a Java program to replace a specified character with another character in a string.
 *  for ex - "abcde" user says replace a with b -> "bbcde"
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter from the String 'abcde' yoy want to replace");
		
		String s1=sc.next();
		char[] s=new char[]{'a','b','c','d','e'};
		System.out.println("Enter your letter to replace:"+s1+" with the desired letter=__");
		String s2=sc.next();
	
		for(int i=0;i<s.length;i++)
		{
			if(s1.charAt(0)==s[i])
			{
				s[i]=s2.charAt(0);
			}
		}
		System.out.print("Updated String-->");
		for(char data:s)
		{
			System.out.print(data);
		}
		
	}
}
