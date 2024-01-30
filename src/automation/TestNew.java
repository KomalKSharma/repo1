package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNew {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);		
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com");
		
		chrome.manage().window().maximize();
		
		Dimension mobileDim = new Dimension(200, 600);
		chrome.manage().window().setSize(mobileDim);
		
		Point point = new Point(300, 100);
		chrome.manage().window().setPosition(point);
		
		System.out.println(chrome.getTitle()); // title of the web page
		System.out.println(chrome.getCurrentUrl());  // it gives current url of the web page
	//	System.out.println(chrome.getPageSource()); // it gives us page source of the web page
		
	//	chrome.close(); // it closes active webpage only
		
		chrome.quit(); //complete session close i.e., closes all tabs
	}

}
