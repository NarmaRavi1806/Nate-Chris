package classlibraries;

import java.time.LocalDate;
import java.time.Month;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate purchasedate= LocalDate.of(1997,Month.JUNE,22);
		
		LocalDate warrantee = purchasedate.plusMonths(6);
		LocalDate warrantee1 = warrantee.plusYears(2);
		System.out.println(purchasedate);
		System.out.println("Warrantee date is:"+warrantee1);

	}

}
