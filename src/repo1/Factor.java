package repo1;

public class Factor {

	public static void main(String[] args) {
		int number = 24;
		Factor result = new Factor();
		result.factorOfNumber(number);
	}
	
	int factorOfNumber(int a) {
		int factor = 0;
		for(int i=1; i<=a; ++i) {
			if(a%i==0) { // Modulo Operator => It returns the remainder of dividing the left hand operand by right hand operand. It's used to get the remainder of a division problem.
				System.out.println("factor is:" + i);
			}
		}
		return a;
		
	}

}
