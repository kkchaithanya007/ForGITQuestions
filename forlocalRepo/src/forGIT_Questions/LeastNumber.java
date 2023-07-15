package forGIT_Questions;

import java.util.Scanner;

public class LeastNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		
		int least=a;
		
		if(b<least)
			least=b;
		if(c<least)
			least=c;
		sc.close();
		System.out.println("Least among Three="+least);
		
	}
}
