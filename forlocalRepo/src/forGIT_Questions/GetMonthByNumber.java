package forGIT_Questions;

import java.util.Scanner;

public class GetMonthByNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to see the month");
		int month = sc.nextInt();
		String s;
		switch (month) {
		case 1:
			s= "January";
			break;
		case 2:
			s= "February";
			break;
		case 3:
			s= "March";
			break;
		case 4:
			s= "April";
			break;
		case 5:
			s= "May";
			break;
		case 6:
			s= "June";
			break;
		case 7:
			s= "July";
			break;
		case 8:
			s = "August";
			break;
		case 9:
			s = "September";
			break;
		case 10:
			s = "October";
			break;
		case 11:
			s = "November";
			break;
		case 12:
			s = "December";
			break;
		default:
			s = "Invalid Month";
			break;
		}
		System.out.println("Given number "+month+" gives the month as:"+s);
	}

}
