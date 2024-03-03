package repo1;

public class ConstructorAsAPrivateAccessModifier {

	public static void main(String[] args) {
		A k1 = A.objectMethod();
		k1.hello();
	}
}

class A{
	private A() {

	}

	public static A objectMethod() {
		A k1 = new A();
		return k1;
	}

	public void hello() {
		System.out.println("my name is hello method");
	}
}
