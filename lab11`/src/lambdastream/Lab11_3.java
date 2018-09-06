package lambdastream;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Lab11_3 {
//	interface Operation{
//		public boolean accept(String s1,String s2);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab11_3 ll=new Lab11_3();
		BiConsumer<String,String> f=(x,y)->{//accept(x,y);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter user name: ");
//		String ss=sc.nextLine();
//		System.out.println("Enter Password: ");
//		String ss1=sc.nextLine();
		boolean b=x.matches("[A-Za-z0-9]{6,12}");
		b = y.matches("[A-Z][a-z0-9]{5,10}");
		System.out.println(b);
		//return b;
		};
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter user name and Password: ");
		
		f.accept(sb.nextLine(),sb.nextLine());
		//f.accept(x,y);
	}

}
