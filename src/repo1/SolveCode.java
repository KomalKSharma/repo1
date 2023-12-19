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
		
		
		int i = 10; 
		int j = i++ + ++i; 
		System.out.println(i); 
		System.out.println(j);
		
		
		int ii = 10;
		int jj= 7; 
		double db1 = ii/jj;
		System.out.println(db1);
//		
		
		int ii1 = 10;
		int jj1= 7; 
		
		double db2 = (double)ii1/jj1; 
		System.out.println(db2);
//		
		
		int ii2 = 10;
		int jj2 = 7; 
		
		double db3 = ii2/(double)jj2;
		System.out.println(db3);
//		
		
	}


}
