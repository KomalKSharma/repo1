package repo1;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		int[] input = {3,4,6};
		
		ReverseInt result = new ReverseInt();
		result.reverseInt(input);
	}
	
	public int reverseInt(int[] input) {
		int[] rev = {};
		int length = rev.length;
		int reverseInt = 0;
		System.out.print("reverse array is: [");
		for(int i = input.length-1 ; i >= 0 ; i--) {
			reverseInt = input[i];
			System.out.print(reverseInt);
		} 
		System.out.print("]");
		return reverseInt;
	}
}
