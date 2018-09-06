/**
 * 
 */
package login;

import java.util.Date;

/**
 * @author narmar
 *
 */
public class helloworld {

	/**
	 * author name: Narmatha date:21-june,2018 description: simple java program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c=new calc();
		Date d=new Date();
		c.print();
		
		calc obj=new calc();
		int y=obj.addition(10, 10);
		System.out.println(d);
		System.out.println("the value of addition is "+y);
		System.out.println("Hellow World");

	}

}
