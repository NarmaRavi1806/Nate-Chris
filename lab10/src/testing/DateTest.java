package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DateTest {
	Date d;
	
	@Before
	public void init(){
		d=new Date(12,04,2000);
	}

	
	@Ignore
	@Test
	public void testSetDay() {
		d.setDay(12);
		assertEquals(12,d.getDay());
		
	}
	
	@Test
	public void testGetDay() {
		d.setDay(12);
		assertEquals(12,d.getDay());
	}
	@Ignore
	@Test
	public void testSetMonth() {
		d.setMonth(04);
		assertEquals(04,d.getMonth());
	}
	
	@Test
	public void testGetMonth() {
		d.setMonth(04);
		assertEquals(04,d.getMonth());
	}
	@Ignore
	@Test
	public void testSetYear() {
		d.setYear(2000);
		assertEquals(2000,d.getYear());
	}
	
	@Test
	public void testGetYear() {
		d.setYear(2000);
		assertEquals(2000,d.getYear());
	}

	@Test
	public void testToString() {
		System.out.println(d);
	}

}
