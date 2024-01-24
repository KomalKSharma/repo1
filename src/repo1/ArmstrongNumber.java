package repo1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan= new Scanner(System.in);
	//	while (true) {
			//System.out.println("Enter Interger to make Armstrong Number for the same");
	//		int x = scan.nextInt();

			ArmstrongNumber cal = new ArmstrongNumber();

				int m1 = cal.one(1,5,2);
		     	System.out.println(m1);
		}
	//}
	
	int one(int...i) {
		int sum = 0;
		for(int a=0; a<i.length ;a++) {
			sum = sum + i[a];
		}
		return sum;
	}
/*	int one(int i) {
		int l = (i*i*i);
		return l;
	}

	int one(int i, int j) {
		int l = (i*i*i) + (j*j*j);
		return l;
	}		
	int one(int i, int j, int k) {
		int l = (i*i*i) + (j*j*j) + (k*k*k);
		return l; 
	} */

}