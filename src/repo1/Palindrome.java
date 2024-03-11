package repo1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter input to check palindrome : " );
		String input = scan.next();
		
			char[] arr = input.toCharArray();
			//char[] charArr = new char[input];
			
			//String inputValues = input;
			String reverseString = "";
			for(int i= arr.length-1; i>=0; i-- ) {
				reverseString = reverseString+arr[i];
			}
			System.out.println("value of : " + reverseString);
		
		boolean Result = input.equals(reverseString);  
		if(Result) {
			System.out.println("this is the palindrome: true");
		}else {
			System.out.println("this is not palindrome: false");
		}
		
		
		/*
		int k2 = Integer.reverseBytes(k1);
		
		System.out.println("reverse" + k2);
		
		if(k1 == k2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		*/
		
		
		
		
		

	}

}
