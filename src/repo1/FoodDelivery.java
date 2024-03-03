package repo1;

import java.util.Scanner;

public class FoodDelivery {

	public static void main(String[] args) {
		//	Zomato runtimePolymorphism = new HotelSaiMaya();
		//	System.out.println(runtimePolymorphism.PavBhaji());
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("please add your budget here:");
			int budget = scan.nextInt();
			Zomato runtimePolymorphism = null;

			switch (budget) {
			case 50:
				runtimePolymorphism = new HotelNetra();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 100:
				runtimePolymorphism = new HotelVaishali();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 200:
				runtimePolymorphism = new HotelRupali();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 300:
				runtimePolymorphism = new HotelSaiMaya();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 400:
				runtimePolymorphism = new Hotel360();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			default:
				runtimePolymorphism = new Zomato();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
			}
		}

	}
}

class Zomato{
	public int PavBhaji(){
		return 199;
	}

	int Pulao() {
		return 200;
	}
}

class HotelVaishali extends Zomato{
	public int PavBhaji(){
		return 100;
	}
}

class HotelRupali extends Zomato{
	public int PavBhaji(){
		return 200;
	}
}

class HotelSaiMaya extends Zomato{
	public int PavBhaji(){
		return 300;
	}
}

class Hotel360 extends Zomato{
	public int PavBhaji(){
		return 400;
	}
}

class HotelNetra extends Zomato{
	public int PavBhaji(){
		return 40;
	}
}

