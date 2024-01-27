package repo1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for(int i = 1; i<=20; i++) {
			k = i/i;
			if(k!=0) {
				System.out.println("prime number" + k);
			} else {
				System.out.println("not prime number" + k);
			}
		}

	}

}
