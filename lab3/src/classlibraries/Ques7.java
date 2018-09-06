package classlibraries;

import java.util.Scanner;



public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		String s;
		s= sc.nextLine();
		boolean status=true;
		
		 if(s.indexOf("_job") != -1 && s.length()>=8){
	            System.out.println(status);
	        }else{
	        	System.out.println("Invalid name");
	            System.out.println(status);
	        }

		

	}

}
