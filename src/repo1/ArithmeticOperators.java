package repo1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 3/4;
		float b = 6/9;
		
		System.out.println("Sum: " + (a + b));
		System.out.println("Difference: " + (a - b));
		System.out.println("Product: " + (a * b));
		System.out.println("Average: " + ((a + b)/2));
		System.out.println("Distance: " + (a - b));
		if (a > b) {
		System.out.println("Max: " + a);
		}
		
		
		if (b < a) {
			System.out.println("Min: " + b);
		}
		

	}

}
