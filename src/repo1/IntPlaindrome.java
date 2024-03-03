package repo1;

public class IntPlaindrome {

	public static void main(String[] args) {
		IntPlaindrome palObject = new IntPlaindrome();
		int result = palObject.integerReverse(1,2,4); 
		System.out.println(result);
		
	}
	
	public int integerReverse(int...inputValues){
		int reverse = 0;
		for(int i=0; i>inputValues.length; i--) {
			reverse = inputValues[i];
		}
		return reverse;
	}
}
