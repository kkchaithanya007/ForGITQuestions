package forGIT_Questions;

import java.util.Scanner;

public class MakeAbbrevationFromString 
{
	/*
	 * 38. Take string as input and print only the initials of them. for example- "Computer Science" -> "CS"
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String for it's Abbrevation");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		System.out.print(s.charAt(0));
		int i=0;
		for(;i<ch.length;i++)
		if(Character.isWhitespace(ch[i]))
		{
			System.out.print(ch[i+1]);
		}
	}
}
