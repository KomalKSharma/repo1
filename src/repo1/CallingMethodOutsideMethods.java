package repo1;

public class CallingMethodOutsideMethods {

	public static void main(String[] args) {
		CallingMethodOutsideMethods res = new CallingMethodOutsideMethods();
		System.out.println(res.k);
	}
	
	int k = m1();
	public static int m1() {
		return 10;
	}
	
public static void test1() {
	return;
}

}
