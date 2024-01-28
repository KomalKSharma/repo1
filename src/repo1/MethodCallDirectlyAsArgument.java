package repo1;

public class MethodCallDirectlyAsArgument {

	public static void main(String[] args) {
		MethodCallDirectlyAsArgument result = new MethodCallDirectlyAsArgument();
		int one = result.add(result.add(10,20), result.add(30, 40));
		System.out.println("result is: " + one);
	}
	
	public int add(int i, int j) {
		return i+j;
	}

}
