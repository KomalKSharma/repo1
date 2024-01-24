package repo1;

public class StaticVariableScope {
	
	class A{
		static int i = 10;
		}
		class B{
		public static void main(String[] args){
		System.out.println(A.i);
	//	A a1 = new A();
	//	System.out.println(a1.i);
		}
		}

}
