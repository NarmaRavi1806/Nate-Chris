package classlibraries;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string:");
		String s= sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		int l= sb.length();
		for(int i=1;i<l;i++)
		{
			char curr=sb.charAt(i);
			char last=sb.charAt(i-1);
			if(curr>last)
			{
				System.out.println("String is Positive");
			}
			else
			{
				System.out.println("String is Negative");
			}
		}

	}

}
