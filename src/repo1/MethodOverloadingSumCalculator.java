package repo1;

import java.util.Scanner;

public class MethodOverloadingSumCalculator {

	public static void main(String[] args) {
		//Scanner s1 = new Scanner(System.in);
		//int s1 =
		MethodOverloadingSumCalculator result = new MethodOverloadingSumCalculator();
		double add = result.sum(11.88f, 233.88f);
		System.out.println(add);

	}
	
	int sum(int i, int j) {
		int k = i + j;
		return k;
	}
	
	float sum(float i, float j) {
		float k = i + j;
		return k;
	}

}
