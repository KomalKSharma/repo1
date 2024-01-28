package repo1;

public class NonParameterizedMethod {

	public static void main(String[] args) {
		NonParameterizedMethod result = new NonParameterizedMethod();
		//result.test1();
		result.test2();
	}
	
	static void test1() {
		System.out.println("test1");
	}
	
	void test2() {
		test1();
		System.out.println("test2");
		return;
	}

}
