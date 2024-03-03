package repo1;

public class Browse {

	public static void main(String[] args) {
		Browser newBrowser = new ChromeBrowser();
		System.out.println(newBrowser.m1());
	}

}

interface Browser{
	public int m1();
	//different variables
	//extend interfaces
	//difference between abstract class and interfaces
	//constructor of interface and abstract class
}

class ChromeBrowser implements Browser{
	public int m1() {
		return 2;
	}
}

class FirefoxBrowser implements Browser{
	public int m1() {
		return 3;
	}
}

class MozillaBrowser implements Browser{
	public int m1() {
		return 4;
	}
}

class InternetExplorerBrowser implements Browser{
	public int m1() {
		return 5;
	}
}