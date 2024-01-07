package repo1;

public class StringInterning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k1 = "komal";
		String k2 = new String("komal"); 
	
		System.out.println(k1==k2);
		
		k2 = k2.intern();
		
		System.out.println(k1 == k2);
		

	}

}
