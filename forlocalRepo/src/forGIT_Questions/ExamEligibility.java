package forGIT_Questions;

import java.util.Scanner;

public class ExamEligibility {
/*
 * 16. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student allowed to sit in exam or not.

 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of class's held and No.of Classs's attended");
		int held=sc.nextInt(),attend=sc.nextInt();
		
		int eligible=(attend*100)/held;
		if(eligible>=75)
			System.out.println("You attended:"+attend+" Class's Out of "+held+" and Attendence percent is:"
					+ ""+eligible+"%"+" You can take test");
		else
			System.out.println("Your attendence is:"+eligible+"% less than 75%, U Are not eligible ");
		
		sc.close();
		}
	}
