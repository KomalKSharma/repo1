package repo1;

public class TypeCaste {

	public static void main(String[] args) {
	    byte b1 = (byte)130;
	    byte b2 = (byte)(short)130;
	    byte b3 = (byte)(int)(short)130;
	    System.out.println("b1 : " + b1);
	    System.out.println("b2 : " + b2);
	    System.out.println("b3 : " + b3);

	}

}
