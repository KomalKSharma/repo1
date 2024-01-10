package repo1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		String todayDate = dateFormat.format(date);
		System.out.println(todayDate);
		
		
		
		String directory = System.getProperty("user.dir");
		
		System.out.println(directory+"\\"+todayDate);
		
		String address = directory+"\\"+todayDate;
		
		File file1 = new File(address);
		
		file1.mkdir();		

	}

}
