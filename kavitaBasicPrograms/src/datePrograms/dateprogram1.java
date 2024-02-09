package datePrograms;
import java.util.Date;
public class dateprogram1 {
	public static void main(String[] args) {
				
		Date d=new Date();
		System.out.println(d.getTime());
		
		Date d1=new Date(d.getTime());
		System.out.println(d1);   // present time
		
		//finding the future ,past time		
		
		//two days from now future
		Date d2=new Date(d1.getTime()+(1000*60*60*24*1));   // here 1 means addition of 1 day
		System.out.println(d2);		
		Date d3=new Date(d1.getTime()+(1000*60*60*24*5));   // here 1 means addition of 1 day
		System.out.println(d3);	
		
		//a)print date format 10-nov-2023 b) print nov-11-2023 c) print 11/nov/2023		
		String timeformat=d3.toString();
		
		String day=timeformat.substring(0, 3);
		System.out.println(day);
		
		String month=timeformat.substring(4, 7);
		System.out.println(month);
		
		String date=timeformat.substring(8, 10);
		System.out.println(date);
		
		String year=timeformat.substring(24, 28);
		System.out.println(year);
		
		String dateformat=date.concat("-").concat(month).concat("-").concat(year);
		String dateformat1=month.concat("-").concat(date).concat("-").concat(year);
		String dateformat2=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(dateformat);
		System.out.println(dateformat1);
		System.out.println(dateformat2);	
	}
}
