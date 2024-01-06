package repo1;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to test it positive or negative: ");
		int input = scan.nextInt();
		if(input>=0) {
			System.out.println("Number is positive");
			
		} else {
			System.out.println("Number is negative");
		}
		}
		

	}
