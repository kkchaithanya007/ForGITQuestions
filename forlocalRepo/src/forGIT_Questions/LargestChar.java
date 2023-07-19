package forGIT_Questions;

import java.util.Scanner;

public class LargestChar {
/*
 * 41. Find the largest character in a string. for ex- "bcdaef" -> 'f'.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String with min 2Char to compare");
		String s=sc.next().toLowerCase();
		char[] ch=s.toCharArray();
		int i=0,j=0;
		char c=ch[0];
		if(ch[0]>ch[1])
		{
			c=ch[0];
		}
		for(i=ch.length-1; i>=0;--i)
		{
			if(ch[i]>c)
			{
				c=ch[i];
				j=i;
			}
		}
		
		System.out.println("Biggest char from String is ="+ch[j]);
		}
	
}
