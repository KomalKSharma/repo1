package repo1;

public class MergeString {

	public static void main(String[] args) {
		MergeString output = new MergeString();
		System.out.println(output.merge());
		
	}
	
	String merge() {
		String input1 = "abcdef";
		String input2 = "1234567890";
		String mergestr = "";
		mergestr = input1 + input2;
		return mergestr;
	}

}
