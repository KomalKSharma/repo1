package repo1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for(int j=0; j<=5;j++) {
			sum = sum + i;
			System.out.println("finbonacci series is: " + sum);
			i = sum + i;
			System.out.println("finbonacci series is: " + i);
		}
	}

}
