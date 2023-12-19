package repo1;

public class TemperatureScale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float celsius = 0.0f;
	//	°F = 1.8°*celsius + 32°;
		float fara = (1.8f * celsius) + 32; 
		System.out.println("fara: " + fara);
		
		float kelvin = celsius + 273;
		System.out.println("kelvin: " + kelvin);
		
		
		

	}

}
