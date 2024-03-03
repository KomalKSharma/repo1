package repo1;

public class SuperKeyword {

	public static void main(String[] args) {
		//Two twoObject = new Two();
		Three threeObject = new Three(20);
	}
}

class One {
	One(int i){
		System.out.println("this is the ONe parameterized " + "value of i in one is: " + i);
	}

	One(){
		this(30);
		System.out.println("this is the ONe non parameterized");
	}
}

class Two extends One{
	Two(int i){
		//super(); => if not write then also it will call
		System.out.println("this is the TWo parameterized " + "value of i in two is: " + i);
	}

	Two(){
		this(10);
		System.out.println("this is the TWo non-parameterized");
	}
}

class Three extends Two{
	Three(){
		System.out.println("this is the THree non-parameterized");
	}
	
	Three(int i){
		this();
		System.out.println("this is the THree parameterized "  + "value of i in three is: " + i);
	}
}