package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelativeAbsolute {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//relative path => based on attribute value
		//it can directly goes to distinct path
		//directly jump to the distinct path
		// double slash used for relative path 
		//eg. /html//button[@id='button']
		//in relative xpath we are having text() 
		//eg., /html//button[text()='clivkStock1']
		//relative path is most reliable one for xpath
		//absolute path => goes to parent to child using hierarchy
		// single slash used for absolute path
		//eg. /html/body/div/div[1]/button[1]
		
		//to go one level up from the path use => /..
		//hybrid xpath => relative + absolute
		//eg., /html/span[text()='swiggy']/../../td[3]/span
		//we used attributes which chances of change will be least and 
		//which we can see manually or identify manually
		
	}

}
