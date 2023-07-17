package forGIT_Questions;

import java.util.Scanner;

public class Reverse1stHalf {
/*
 * 39. Reverse the first half of the string. for ex- "abcde" -> "bacde" another ex- "abcdef" -> "cbadef"
 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		char[] ch1=s.toCharArray();
		int len=ch.length , j=0;
		for(int i=((len-1)/2);i>=0;i--)
		{
			ch[j]=ch1[i];
			j++;
		}
		System.out.print("Before-Reverse:"+s+", After reverse 1stHalf:");
		for(char data:ch)
		{
			System.out.print( data);
		}
	}
}
