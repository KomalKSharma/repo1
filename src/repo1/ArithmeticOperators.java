package repo1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = Calculator.sum((3/4), (6/9));
		System.out.println("sum is: "+ m);
		
		double m1 = Calculator.minus(3/4, 6/9);
		System.out.println("difference is: "+ m1);
		
		double m2 = Calculator.multiply(3/4, 6/9);
		System.out.println("product is: "+ m2);
		
		double m3 = Calculator.average(3/4, 6/9);
		System.out.println("average is: "+ m3);
		
		double m4 = Calculator.minus(3/4, 6/9);
		System.out.println("distance is: "+ m4);
		
		
		
		
		//System.out.println("Sum: " + (a + b));
		//System.out.println("Difference: " + (a - b));
		//System.out.println("Product: " + (a * b));
		//System.out.println("Average: " + ((a + b)/2));
		//System.out.println("Distance: " + (a - b));
	}
	
	class Calculator {
		static float sum(float i, float j) {
			float k = i+j;
			return k;
		}
		
		static double sum(double i, double j) {
			double k = i+j;
			return k;
		}
		
		static float sum(int i, float j) {
			float k = i+j;
			return k;
		}
		static float sum(float i, int j) {
			float k = i+j;
			return k;
		}
		static float sum(int i, int j) {
			float k = i+j;
			return k;
		}
		
		static float minus(float i, float j) {
			float k = i-j;
			return k;
		}
		
		static double minus(double i, double j) {
			double k = i-j;
			return k;
		}
		
		static float minus(int i, float j) {
			float k = i-j;
			return k;
		}
		static float minus(float i, int j) {
			float k = i-j;
			return k;
		}
		static float minus(int i, int j) {
			float k = i-j;
			return k;
		}
		
		
		static float multiply(float i, float j) {
			float k = i*j;
			return k;
		}
		
		static double multiply(double i, double j) {
			double k = i*j;
			return k;
		}
		
		static float multiply(int i, float j) {
			float k = i*j;
			return k;
		}
		static float multiply(float i, int j) {
			float k = i*j;
			return k;
		}
		static float multiply(int i, int j) {
			float k = i*j;
			return k;
		}
		
		static float average(float i, float j) {
			float k = (i+j)/2;
			return k;
		}
		
		static double average(double i, double j) {
			double k = (i+j)/2;
			return k;
		}
		
		static float average(int i, float j) {
			float k = (i+j)/2;
			return k;
		}
		static float average(float i, int j) {
			float k = (i+j)/2;
			return k;
		}
		static float average(int i, int j) {
			float k = (i+j)/2;
			return k;
		}
		
	/*	static float max(int i, int j) {
		if (i > j) {
		System.out.println("Max: " + i);
		}
		if (i < j) {
			System.out.println("Min: " + j);		
		}
		
	} */
		
	}
}
		
		