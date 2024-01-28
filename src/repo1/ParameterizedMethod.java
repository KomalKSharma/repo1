package repo1;

public class ParameterizedMethod {

	public static void main(String[] args) {
		ParameterizedMethod result = new ParameterizedMethod();
		System.out.println("add result is: " + result.add(3, 4));
		System.out.println("divide result is :" + result.divide(5, 2));
	}
	
	static int add(int i, int j) {
		int k = i + j;
		return k;
	}
	
	double divide(int a, int b) {
		int k = a/b;
		return k;
	}

}
