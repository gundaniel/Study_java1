package exam_file;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
	public static void main(String[]args) {
	
	Date today = new Date();
		
	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
	
		System.out.println(date.format(today));
	}
}