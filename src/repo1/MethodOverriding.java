package repo1;

public class MethodOverriding {

	public static void main(String[] args) {
		School schoolObject = new School("Komal", 22);
		System.out.println(schoolObject);
		
		System.gc();
	}
}

class School extends Object{
	String name;
	int rollNumber;
	
	School(String name, int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
	System.out.println("hello, my name is: " + this.name + "and my roll number is: " + this.rollNumber);
	return "";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("hello there, my name is" + this.name + "garbage collector");
        //super.finalize();

	}
	
	
}
