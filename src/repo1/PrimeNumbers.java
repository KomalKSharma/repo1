package repo1;

public class PrimeNumbers {

	public static void main(String[] args) {
		PrimeNumbers result = new PrimeNumbers();
		result.Prime();
		
	}
	
	int Prime() {
		int i;
		for(i=3; i<=24; i++) {
			if(i/1==i && i/i==1) {
				System.out.println("prime number is:" + i);
			}
		}
		return i;
		
	}

}
