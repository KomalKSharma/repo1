package repo1;

public class StaticBlock {
	
	public static void main(String[] args){
		
		System.out.println("main method");
		
		}
	
	class A{

		static{
		System.out.println("first block");  
		  }
		  static{
		System.out.println("second block");  
		  }


		  }

}
