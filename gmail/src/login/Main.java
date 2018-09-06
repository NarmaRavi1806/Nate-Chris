package login;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number n[]=new Number[10];
		
		n[0]=new Integer(10);
		n[1]=new Short((short)2);
		n[2]=new Float(10.0);
		n[3]=new Double(12.5433);
		
		for (Number number : n) {
			System.out.println(number);
			
		}
	
		Student srr[]=new Student[5];
		
		srr[0]=new Student(1,"ramya");
		srr[1]=new Student(2,"ramya");
		srr[2]=new Student(3,"ramya");
		srr[3]=new Student(4,"ramya");
		srr[4]=new Student(5,"ramya");
		srr[4]=new Student1(6,"priya");
	
	for (Student student:srr){
		System.out.println(student);
	}
	Scanner sc=new Scanner(System.in);
	int vrr[][]=new int[3][2];
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2; j++) {
			vrr[i][j]=sc.nextInt();
			System.out.println(vrr[i][j]);
		}
	}

}
}