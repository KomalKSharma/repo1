package repo1;

public class TimeConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSecs = 86399;
		
		int hours = totalSecs / 3600; 
		int minutes = (totalSecs % 3600) / 60; 
		int seconds = totalSecs % 60; 
		System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");

	}
}
