package repo1;

public class ThisConstructorFirstCall {

	public static void main(String[] args) {
		ThisConstructorFirstCall a1 = new ThisConstructorFirstCall();
		
	}
	
	ThisConstructorFirstCall(){
		this(3);
		System.out.println("Hello");
	}
	
	ThisConstructorFirstCall(int i){
		System.out.println("i value is: " + i);
	}
	

}
