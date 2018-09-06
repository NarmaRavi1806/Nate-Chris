package exceptions;

import java.util.Scanner;

@SuppressWarnings("serial")
public class AgeException extends Exp {
	
	private int age;
	AgeException(int a) {
	age = a; }
	public String toString() {
	return age+" is an invalid age"; } }
	class emp{
	String name;
	int age;
	void getDetails() throws AgeException{
	System.out.println("Enter your name:");
	Scanner sc=new Scanner(System.in);
	name=sc.next();
	System.out.println("Enter your age:");
	age=sc.nextInt();
	if (age<16)
	throw new AgeException(age);
	System.out.println("Name:"+name);
	System.out.println("Age: "+age);
	}}


