package forGIT_Questions;

import java.util.Scanner;

public class DiscountOnQuantity 
{
	//12. A shop will give discount of 10% if the cost of purchased quantity is more than 1000. 
	//Ask user for quantity. Suppose, one unit will cost 100. Judge and print total cost for user.
	public static void main(String[] args) {
		double unit;
		Scanner sc=new Scanner(System.in);
		System.out.println("for Purchasing  quantity enter units");
		unit=sc.nextDouble();
		double finalUnit=unit*100;
		
		if(finalUnit>1000)
		{
			finalUnit=finalUnit-(double)finalUnit*(10/100);
			System.out.println("10% discount for shopping above 1000/- Total bill ="+finalUnit+
					" No.of units purchased="+unit);	

		}
		else
			System.out.println("Total bill ="+finalUnit+" No.of units purchased="+unit);	
	}
}
