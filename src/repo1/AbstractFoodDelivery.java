package repo1;

import java.util.Scanner;

public class AbstractFoodDelivery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("please add your budget here from 50, 100, 200, 300, 400:");
			int budget = scan.nextInt();
			Swiggy runtimePolymorphism = null;

			switch (budget) {
			case 50:
				runtimePolymorphism = new HotelNetra1();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 100:
				runtimePolymorphism = new HotelVaishali1();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 200:
				runtimePolymorphism = new HotelRupali1();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 300:
				runtimePolymorphism = new HotelSaiMaya1();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 400:
				runtimePolymorphism = new Hotel3601();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			default:
				System.out.println("please give valid budget");
				//runtimePolymorphism = new Swiggy(); // not possible because abstract class ke object nahi bante, it is following HAS-A-relationship
				//System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
			}
		}
	}

}

abstract class Swiggy{
	public abstract int PavBhaji(); // is it valid to not add return type for int method here?

	int Pulao() {
		return 200;
	}
}

class HotelVaishali1 extends Swiggy{
	public int PavBhaji(){
		return 100;
	}
}

class HotelRupali1 extends Swiggy{
	public int PavBhaji(){
		return 200;
	}
}

class HotelSaiMaya1 extends Swiggy{
	public int PavBhaji(){
		return 300;
	}
}

class Hotel3601 extends Swiggy{
	public int PavBhaji(){
		return 400;
	}
}

class HotelNetra1 extends Swiggy{
	public int PavBhaji(){
		return 40;
	}
}