package repo1;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Give input i.e., 3 numbers :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater i.e., " + a); 
		}else if(b>a && b>c) {
			System.out.println("b is greater i.e.," + b);
		} else if(c>a && c>b){
			System.out.println("c is greater i.e.," + c);
		}
	}
}
