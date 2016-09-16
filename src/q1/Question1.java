package q1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args){
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.print("Enter TD: ");
		double TD = input.nextDouble();
		System.out.print("Enter Yards: ");
		double Yards = input.nextDouble();
		System.out.print("Enter INT: ");
		double INT = input.nextDouble();
		System.out.print("Enter comp: ");
		double comp = input.nextDouble();
		System.out.print("Enter ATT: ");
		double ATT = input.nextDouble();
		double QB = ((8.4*Yards) + (330*TD) + (100*comp) - (200*INT))/ATT;
		System.out.printf("THE QB Rating is% .2f \n", QB); 
		
	}
}
