package repo1;

public class SumAllDigit {

	public static void main(String[] args) {
		SumAllDigit s1 = new SumAllDigit();
		int k1 = s1.sumDigits(2,3,4);
		System.out.println("Sum of all digits: " + k1);
		
	}
	
	int sumDigits(int...inputValues) {
		int sum = 0;
		for(int input : inputValues) {
			sum += input;
		}
		return sum;
		
	}

}
