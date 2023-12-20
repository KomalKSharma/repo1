package repo1;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Give input i.e., 3 numbers :");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if(a>b) {
			System.out.println("a is greater than b i.e., " + a);
			} else if(b>c) {
				System.out.println("b is greater than c i.e.," + b);
			} else {
				System.out.println("c is greater i.e.," + c);
			}
		}

	}

}
