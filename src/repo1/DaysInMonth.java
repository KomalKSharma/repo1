package repo1;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter month number between 1 to 12 to know days in month :");
			int month = scan.nextInt();
			switch (month) {
			  case 1:
			    System.out.println("31");
			    break;
			  case 2:
			    System.out.println("29");
			    break;
			  case 3:
			    System.out.println("31");
			    break;
			  case 4:
			    System.out.println("30");
			    break;
			  case 5:
			    System.out.println("31");
			    break;
			  case 6:
			    System.out.println("30");
			    break;
			  case 7:
			    System.out.println("31");
			    break;
			  case 8:
				    System.out.println("31");
				    break;
			  case 9:
				    System.out.println("30");
				    break;
			  case 10:
				    System.out.println("31");
				    break;
			  case 11:
				    System.out.println("30");
				    break;
			  case 12:
				    System.out.println("31");
				    break;
			    default:
			    	System.out.println("Invalid Month");
			}
	}

	}

}
