package repo1;

public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	infiniteWhile();
	//	infiniteFor();
		infiniteDoWhile();
		
	}
	
/*	public static void infiniteWhile() {
	    while (true) {
	        System.out.println("Infinite While loop");
	    }
	}

	public static void infiniteFor() {
	    for (int i=0; true; i++) {
	    	System.out.println("Infinite For loop");
	    }
	}
*/	
	public static void infiniteDoWhile() {
	    do {
	    	System.out.println("Infinite Do While loop");
	    } while (true);
	}

}
