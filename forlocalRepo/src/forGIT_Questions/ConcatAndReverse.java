package forGIT_Questions;

import java.util.Scanner;

public class ConcatAndReverse {
/*
 * 42. take two strings, concatenate(add) them and print the reverse. for ex- "abc" and "cde" -> 
 * after concatenation -> "abccde" -> after reverse -> "edccba".
 */
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Two Strings");
	String s=sc.nextLine() ,s1=sc.nextLine();
	s=s.concat(s1);
	System.out.println("Concated String:"+s);
	char[] ch=s.toCharArray();
	char [] c=new char[ch.length];
	int i=0,j=0;
	
	for(i=ch.length-1;i>=0;--i)
	{
		c[j]=ch[i];
		j++;
	}
	System.out.print("Reverse :");
	for(char data:c)
		System.out.print(data);
	}
}
