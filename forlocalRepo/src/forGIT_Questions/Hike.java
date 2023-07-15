package forGIT_Questions;

import java.util.Scanner;

public class Hike 
{
	
	/*
	 * 13. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. 
	 * 	Ask user for their salary and year of service and print the net bonus amount.

	 */
	static double empDetails(double sal,int year)
	{
		if(year>5)
		{
			double sal1=sal*(5.0/100);//Imp integer by Integer we get Integer Only So,do casting or make one into decimalFormat
			return sal1;
		}
		return 0.0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Salary and years of Service");
		double sal=sc.nextDouble();
		int no_years=sc.nextInt();
		double d=empDetails(sal,no_years);
		System.out.println("Employee salary="+sal+" ;Employee Service="+no_years+" ;Employee's salary with Hike="+(d+sal)); 
	}
}
