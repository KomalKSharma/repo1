package repo1;

public class CallParameterizedConstructorFromDefaultConstructor {
	
	public static void main(String[] args) {
		CallParameterizedConstructorFromDefaultConstructor a1 = new CallParameterizedConstructorFromDefaultConstructor();
		System.out.println(a1);
	}
	
	CallParameterizedConstructorFromDefaultConstructor(){
		this(10);
	}
	
	CallParameterizedConstructorFromDefaultConstructor(int i){
		System.out.println("sysout");
	}

}
