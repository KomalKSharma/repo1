package repo1;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		//int input = 346;
		
		// rev = 0
		// 346 % 10 = 6
		// 346/10 = 34
		// rev = rev * 10 + 6  // 6 
		
		
		// 34 % 10= 4
		//34 / 10 = 3
		// 60+ 4 = 64
		
		// 3%10 = 3
       //  64*10 = 640 + 3 = 643
		
		int input = 346;
		
		int reverse = 0;
		
		
		while(input != 0)   
		{  
		int remainder = input % 10;  
		reverse = reverse * 10 + remainder;  
		input = input/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse); 
		
		/*working code for reverse string
		 *  String input = "komal";
		char[] arr = input.toCharArray();
		//char[] charArr = new char[input];
		
		//String inputValues = input;
		String reverseString = "";
		for(int i= arr.length-1; i>=0; i-- ) {
			reverseString = reverseString+arr[i];
		}
		System.out.println("value of : " + reverseString);
		
		*/
		
	//	int[] input = {3,4,6};
		
		//ReverseInt result = new ReverseInt();
		//System.out.print(result.reverse(input));
		
	//	result.reverseNumber(k);
		
	//	ReverseInt result = new ReverseInt();
	//	result.reverseInt(input);
	}
	/* int reverse(int...input){
		
		String k = null;
		String inputValues = input.toString();
		for(int i= inputValues.length(); i>=0; i-- ) {
			charArr[i] = inputValues.charAt(i); 
			System.out.println("value of : " + input[i]);
		}
		return n;
	} */

/*	to reverse array
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
	
	*/
	
/*	int reverseNumber(int...input){
		int x=0;
		for(int i=0; i>input.length; i--) {
			x = input[i];
			System.out.println(x);
			System.out.println("hello");
		}
		
		return x;
	}   */
}
