import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
//	String d="2020-09-08";
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		String date1="2020-09-08";
//		Date da = new SimpleDateFormat("yyyy-mo-dd").parse(date1);
//		System.out.println(date1+"\t"+da);
		Date date=new Date();
		date.setMonth(9);
		date.parse("08-September-2020");
		
	}

}
