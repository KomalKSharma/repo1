package repo1;

public class SolveCode {
	public static void main(String[] args) {
		// byte b0 = 128; => wrong statement gives compile error => Type mismatch:
		// cannot convert from int to byte
		int b1 = 128;
		byte b2 = (byte) b1;
		System.out.println("value of b2 is " + "" + b2);

		int b3 = 128;
		byte b4 = (byte) (b3 * 3);
		System.out.println("value of b4 is " + "" + b4);
//		
		
	}


}
