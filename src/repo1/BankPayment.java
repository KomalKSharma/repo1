package repo1;

import java.util.Scanner;

public class BankPayment {

	public static void main(String[] args) {

		float totalAmountEarned = 0.0f;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("How much you are paying ?");
			int amount = scan.nextInt();


			System.out.println("Which Bank you want to pay (We support hdfc/sbi/icici) ");
			String input = scan.next();
			PaymentGateway paymentObject = null;
			if(input.equalsIgnoreCase("hdfc")) {
				paymentObject = new Hdfc();
			}else if(input.equalsIgnoreCase("icici")) {
				paymentObject = new Icici();
			}else if(input.equalsIgnoreCase("sbi")) {
				paymentObject = new Sbi();
			}else if(input.equalsIgnoreCase("citi")) {
				paymentObject = new Citibank();
			}else {
				System.out.println("no found");
				return;
			}

			float k1 = paymentObject.interestRate();
			float paymentGatewayAmount = (amount * (k1/100));
			float amountPaidtoBank = amount - paymentGatewayAmount;
			totalAmountEarned = totalAmountEarned + paymentGatewayAmount;
			System.out.println("Amount Paid to bank : " +amountPaidtoBank);
			System.out.println("Amount earn by Gateway : " +paymentGatewayAmount);
			System.out.println("Amount Early today : " + totalAmountEarned);
		}
	}
}

class PaymentGateway{
	public float interestRate() {
		return 5.0f;
	}
}

class Hdfc extends PaymentGateway{
	public float interestRate() {
		return 3.0f;
	}
}

class Icici extends PaymentGateway{
	public float interestRate() {
		return 2.0f;
	}	
}

class Sbi extends PaymentGateway{
	public float interestRate() {
		return 1.0f;
	}
}

class Citibank extends PaymentGateway{
	public float interestRate() {
		return 5.0f;
	}
}