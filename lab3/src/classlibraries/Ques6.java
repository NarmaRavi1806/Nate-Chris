package classlibraries;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZonedDateTime Time = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Time in Paris"+Time);

	}

}
