package repo1;

public class IntializeVarByConstructor {
	int i;

	public static void main(String[] args) {
		IntializeVarByConstructor k1 = new IntializeVarByConstructor(10);
		k1.display();
	}
	
	IntializeVarByConstructor(int i){
		this.i = i;
		System.out.println("value of i is: " + i);
	}
	
	public void display() {
	      System.out.println("Display i is: " + i);
	   }

}
