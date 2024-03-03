package repo1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter input to check palindrome : " );
		int k1 = scan.nextInt();
		
		int k2 = Integer.reverseBytes(k1);
		
		System.out.println("reverse" + k2);
		
		if(k1 == k2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		
		
		
		

	}

}
