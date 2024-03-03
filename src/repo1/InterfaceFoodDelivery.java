package repo1;

import java.util.Scanner;

public class InterfaceFoodDelivery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("please add your budget here from 50, 100, 200, 300, 400:");
			int budget = scan.nextInt();
			Dunzo runtimePolymorphism = null;

			switch (budget) {
			case 50:
				runtimePolymorphism = new HotelNetra2();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 100:
				runtimePolymorphism = new HotelVaishali2();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 200:
				runtimePolymorphism = new HotelRupali2();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 300:
				runtimePolymorphism = new HotelSaiMaya2();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			case 400:
				runtimePolymorphism = new Hotel3602();
				System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
				break;
			default:
				System.out.println("please give valid budget");
				//runtimePolymorphism = new Dunzo(); // not possible because abstract class ke object nahi bante, it is following HAS-A-relationship
				//System.out.println("Prize of Pavbhaji is: " + runtimePolymorphism.PavBhaji());
			}
		}

	}

}


interface Dunzo{
	int i = 10;    // interface variable is constant or static 
	//i = 20;
	public int PavBhaji(); // is it valid to not add return type for int method here?

	int Pulao();
}

interface Dunzo1 extends Dunzo{
	public int PavBhaji(); // is it valid to not add return type for int method here?

	int Pulao();
}

class HotelVaishali2 implements Dunzo, Dunzo1{
	public int PavBhaji(){
		System.out.println("variable i: "+ i);
		return 100;
	}
	
	public int Pulao() {
		return 110;
	}
}

class HotelRupali2 implements Dunzo{
	public int PavBhaji(){
		return 200;
	}
	
	public int Pulao() {
		return 110;
	}
}

class HotelSaiMaya2 implements Dunzo{
	public int PavBhaji(){
		return 300;
	}
	
	public int Pulao() {
		return 110;
	}
}

class Hotel3602 implements Dunzo{
	public int PavBhaji(){
		return 400;
	}
	
	public int Pulao() {
		return 110;
	}
}

class HotelNetra2 implements Dunzo{
	public int PavBhaji(){
		return 40;
	}
	
	public int Pulao() {
		return 110;
	}
}
