package repo1;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Wire wireObject = new Wire();
		wireObject.wireMethod();
		wireObject.computerMethod();
		
	}

}

class Computer{
	public void computerMethod() {
		System.out.println("hello I am computer");
	}
}

class Monitor extends Computer{
	public void monitorMethod() {
		System.out.println("hello I am monitor");
	}
}

class Mouse extends Computer{
	public void mouseMethod() {
		System.out.println("hello I am mouse");
	}
}

class Cpu extends Computer{
	public void cpuMethod() {
		System.out.println("hello I am cpu");
	}
}

class Wire extends Computer{
	public void wireMethod() {
		System.out.println("hello I am wire");
	}
}