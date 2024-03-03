package repo1;

public class MultiLevelInheritance extends A1{

	public static void main(String[] args) {
		MultiLevelInheritance mObject = new MultiLevelInheritance();
		mObject.method(); // child
		mObject.methodA1(); // parent
		mObject.methodA2(); // grandparent
	}
	
	public void method() {
		System.out.println("this is mehtod");
	}
}

class A1 extends A2{
	public void methodA1() {
		System.out.println("this is mehtodA1");
	}
}

class A2{
	public void methodA2() {
		System.out.println("this is mehtodA2");
	}
}
