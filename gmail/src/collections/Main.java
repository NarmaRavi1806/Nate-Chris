package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dao imp=new Dao();
		List<Employeeobj> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("No. of employee:");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter id: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			System.out.println("Enter emailid: ");
			String emailid=sc.next();
			System.out.println("Enter phone no.: ");
			String phone=sc.next();
			Employeeobj e=new Employeeobj(name,emailid,phone,id);
			imp.getList().add(e);
		}

	}

}
