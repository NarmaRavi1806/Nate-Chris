package classlibraries;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Acceptdate {
	
	public static void duration(LocalDate date,LocalDate now)
	{
		Period period=Period.between(date, now);
		System.out.println("Days:"+period.getDays());
		System.out.println("Month:"+period.getMonths());
		System.out.println("Years:"+period.getYears());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse(s,format);
		LocalDate now=LocalDate.now();
		duration(date,now);
		
		/*LocalDate Dob= LocalDate.of(1997,Month.JUNE,22);
		
		System.out.println(Dob);
		LocalDate datenow= LocalDate.now();
		Period period= Dob.until(datenow);
		
		System.out.println("Days:"+period.get(ChronoUnit.DAYS));
		System.out.println("Months:"+period.get(ChronoUnit.MONTHS));
		System.out.println("Years:"+period.get(ChronoUnit.YEARS));*/
		
		

	}

}
