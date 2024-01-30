package repo1;

public class OutputOfBelowMethod {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println("x =" + p.x + ", y = " + p.y);;
	}

}

class Point{
	int x, y;
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
}
