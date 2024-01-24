package repo1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Value : ");
			String input = scan.next();

			String reverString = reverseString(input);
			if(input.equals(reverString)) {
				System.out.println("Palindrom");
			}else {
				System.out.println("not palindrom");
			}
		}
	}

	/**
	 * Return reverse String
	 * @param input
	 * @return
	 */
	public static String reverseString(String input) {
		char[] inputStringArray = input.toCharArray();
		String reverString = "";
		for(int i = inputStringArray.length-1 ; i >= 0 ; i--) {
			reverString = reverString  + inputStringArray[i];
		}
		return reverString;
	}

}
