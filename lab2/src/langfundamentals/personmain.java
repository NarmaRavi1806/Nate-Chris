/**
 * 
 */
package langfundamentals;

/**
 * @author narmar
 *
 */
public class personmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personclass person1=new personclass("Divya","Bharathi",'F');
		personclass person2=new personclass("Divya","Bharathi",'F',9883847755l);
		personclass person3=new personclass("Ravi","Teja",9887645800l);
		
	
		String firstname=person1.getFirstname();
		String lastname=person1.getLastname();
		char gender=person1.getGender();
		
		String fn=person2.getFirstname();
		String ln=person2.getLastname();
		char g=person2.getGender();
		long phoneno=person2.getPhoneno();
		
		String first=person3.getFirstname();
		String last=person3.getLastname();
		long phone=person3.getPhoneno();
		
		System.out.println("Personal Details");
		System.out.println("----------------");
		
		System.out.println("Firstname:"+first);
		System.out.println("Lastnaems:"+last);
		System.out.println("phone no.:"+phone);
		System.out.println("Gender:"+Gender.M);
		
		System.out.println("Personal Details");
		System.out.println("----------------");
		
		System.out.println("Firstname:"+fn);
		System.out.println("Lastnaems:"+ln);
		System.out.println("Gender:"+g);
		System.out.println("phone no.:"+phoneno);
		
		System.out.println("Personal Details");
		System.out.println("----------------");
		
		System.out.println("Firstname:"+firstname);
		System.out.println("Lastnaems:"+lastname);
		System.out.println("Gender:"+gender);
		
		
		

	}

}
