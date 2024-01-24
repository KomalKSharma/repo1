package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestNew {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);		
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com");
	}

}
