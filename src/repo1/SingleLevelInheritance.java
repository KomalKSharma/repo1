package repo1;

public class SingleLevelInheritance extends LevelTwo {

	public static void main(String[] args) {
		newMethod();
	}
}

class LevelTwo{
	
	public static void newMethod(){
		System.out.println("method from LevelTwo");
	}
	
}
