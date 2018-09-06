package classlibraries;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Localdates {
	
	public static void duration(LocalDate d1,LocalDate d2)
	{
		Period period=Period.between(d1, d2);
		System.out.println("Days:"+period.getDays());
		System.out.println("Month:"+period.getMonths());
		System.out.println("Years:"+period.getYears());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1=LocalDate.parse(s1,format);
		LocalDate d2=LocalDate.parse(s2,format);
		duration(d1,d2);
		
		/*LocalDate Dob= LocalDate.of(1997,Month.JUNE,22);
		System.out.println(Dob);
		LocalDate datenow= LocalDate.of(2018,Month.JANUARY,22);
		System.out.println(datenow);
		Period period= Dob.until(datenow);
		
		System.out.println("Days:"+period.get(ChronoUnit.DAYS));
		System.out.println("Months:"+period.get(ChronoUnit.MONTHS));
		System.out.println("Years:"+period.get(ChronoUnit.YEARS));*/

	}

}
