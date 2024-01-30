package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		By k1 = By.id("user-name");
		WebElement searchElement = driver.findElement(k1);
		searchElement.sendKeys("Komal Sharma");
		
		driver.findElement(By.id("password")).sendKeys("Komal@1995");
		
		driver.findElement(By.id("login-button")).click();
		
		
		
		
	}

}
