package repo1;

public class IntMethod {

	public static void main(String[] args) {
		IntMethod result = new IntMethod();
		result.integer();
		System.out.println("result is:" + result.add(2,3));
	}
	
	static void integer() {
		System.out.println("one");
	}
	
	public int add(int i, int j) {
		int k = i+j;
		return k;
	}
	
	

}
