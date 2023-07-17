package forGIT_Questions;

import java.util.Scanner;

public class RemoveSpaces {
/*
 * 37. WAP to remove all the spaces in a string.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String with Spaces you will get no spaces");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		
		int i=0,temp=0;
		char[] ch1=new char[ch.length];
		for(;i<ch.length;i++)
		{
		if(!Character.isWhitespace(ch[i]))
		{
			ch1[temp]=ch[i];
			temp++;
		}
		}
		String s1=new String(ch1,0,temp);
		System.out.println(s1);
	}
}
