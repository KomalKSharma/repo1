package repo1;

public class ConnectionDemo {

	public static void main(String[] args) {
		Connection conn1 = Connection.objectMethod();
		conn1.m1();

	}

}

class Connection{
	
	private Connection() {
		
	}
	
	public static Connection objectMethod() {
		Connection conn1 = new Connection();
		return conn1;
	}
	
	public void m1() {
		System.out.println("hiiiii");
	}
}
