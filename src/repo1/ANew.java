package repo1;

class ANew {
	
	public static void main(String args[]) {
		ANew a1 = new ANew();
	}
	
	ANew(){
		this(10);
		ANew();
	}
	
	ANew(int i){
		System.out.println("Anew constructor" + i);
	}
	
	public void ANew() {
		System.out.println("hello");
	}
}
