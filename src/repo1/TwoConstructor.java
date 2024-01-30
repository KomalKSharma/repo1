package repo1;

public class TwoConstructor {

	TwoConstructor(){
		//this(10);
		this(10,20);
	}
	TwoConstructor(int i){
		System.out.println("first");
	}
	
	TwoConstructor(int i, int j){
		System.out.println("second");
	}

}
