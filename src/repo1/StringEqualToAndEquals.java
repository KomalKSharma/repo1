package repo1;

public class StringEqualToAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k1 = "komal";
		String k2 = "komal";
		String k3 = new String("komal");
		
		System.out.println("Equal to output of k1 and k2: " + (k1 == k2));
		System.out.println("Equal to output of k2 and k3: " + (k2 == k3));
		
		System.out.println("Equals to of k1 and k2: " + k1.equals(k2));
		System.out.println("Equals to of k2 and k3: " + k2.equals(k3));


	}

}
