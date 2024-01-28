package repo1;

public class MethodChaining {

	public static void main(String[] args) {
		MethodChaining result = new MethodChaining();
		result.method1().method2();
	}
	
	MethodChaining method1() {
		System.out.println("method1");
		return this;
	}
	
	MethodChaining method2() {
		System.out.println("method2");
		return this;	
	}

}
