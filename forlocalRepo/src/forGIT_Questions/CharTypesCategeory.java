package forGIT_Questions;

import java.util.Scanner;

public class CharTypesCategeory 
{
	/*
	 * 30. Write a program to find the number of vowels, consonents, digits and white space characters in a string.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int v = 0,c=0,d=0,sp=0;
		for(int i=0;s.length()>i;i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isLetter(ch))
			{
				ch=Character.toLowerCase(ch);
				if(ch!='a' ||ch!='e'||ch!='i'||ch!='o'||ch!='u')
					v++;
				else
					c++;
			}
			if(Character.isDigit(ch))
			{
				d++;
			}
			if(Character.isWhitespace(ch))
				sp++;
		}
		System.out.println("NO.OF Vowels="+v+" ;Cnsonents="+c+" ;digits="+d+" ;Spaces="+sp);
	}
}
