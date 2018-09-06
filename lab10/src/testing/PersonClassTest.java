package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PersonClassTest {
	private static final Class<? extends Throwable> Exception = null;
	PersonClass p;
	
	@Before
	public void init(){
		p=new PersonClass("Jon","Snow",'M');
	}

	@Test
	public void testGetFirstname() {
		p.setFirstname("Jon");
		assertEquals( "Jon",p.getFirstname());
		
		
	}

	@Ignore
	@Test
	public void testSetFirstname() {
		
	}

	@Test//(expected= NullPointerException.class)
	public void testGetLastname() {
		p.setLastname("Snow");
		assertEquals( "Snow",p.getLastname());
	}

	@Ignore
	@Test
	public void testSetLastname() {
		
	}

	@Test
	public void testGetGender() {
		p.setGender('M');
		assertEquals( 'M',p.getGender());
			}

	@Ignore
	@Test
	public void testSetGender() {
		
	}

	@Test
	public void testDisplayDetails() {
		System.out.println("Input from PersonClass");
		System.out.print(p.DisplayDetails());
		//System.out.println(p);
	}

}
