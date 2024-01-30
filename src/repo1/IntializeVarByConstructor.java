package repo1;

public class IntializeVarByConstructor {
	int i;

	public static void main(String[] args) {
		IntializeVarByConstructor k1 = new IntializeVarByConstructor(10);
	}
	
	IntializeVarByConstructor(int i){
		this.i = i;
		System.out.println("value of i is: " + i);
	}

}
