package exceptions;

import java.util.*;


@SuppressWarnings("unused")
public class Personclsques1 {
	
	public static void main(String[] args)throws Exp  {
		Ques_1 p1=new Ques_1();
		Scanner sb=new Scanner(System.in) ;
		System.out.println("Enter the Firstname:");
		try{
			p1.setFirstname(sb.nextLine());
		}catch(Exp e){
			System.out.println("Exception"+e);
		}
		String namef=p1.getFirstname();
		System.out.println("Firstname:"+namef);
		System.out.println("Enter the Lastname:");
		try{
			p1.setLastname(sb.nextLine());
		}catch(Exp e1){
			System.out.println("Exception"+e1);
		}
		String namel=p1.getFirstname();
		System.out.println("Lastname:"+namel);
		char gender=p1.getGender();
		gender=sb.next().charAt(gender);
		System.out.println("Gender:"+gender);
		
		
	}

}
