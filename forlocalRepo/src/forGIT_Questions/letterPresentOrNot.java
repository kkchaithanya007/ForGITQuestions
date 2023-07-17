package forGIT_Questions;

public class letterPresentOrNot 
{
/*
 * 29. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
 */
	
	static char check(String s)
	{
		for(int i=0;s.length()>0;i++) {
		if(s.charAt(i)=='e')
		{
			System.out.println("letter e is present in the Given word 'UMBRELLA'");
			break;
		}
		}
		return '0';
	}
	public static void main(String[] args) 
	{
	check("Umbrella");	
	}
}
