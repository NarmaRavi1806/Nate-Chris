package lambdastream;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lab11_2 {
	
	interface string{
		public void format(String s);
	}
//	public static void format(String s){
//		String s1="capgemini";
//		char ch;
//		  for(int i=0; i<s1.length();i++){
//		         ch = s1.charAt(i);
//		        System.out.print(ch+" ");
//		      } 
//		  //return ch;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> ss=(x)->{//format(x);
		char ch;
		  for(int i=0; i<x.length();i++){
		         ch = x.charAt(i);
		        System.out.print(ch+" ");
		      } 
		};
		ss.accept("narmatha");
		

	}

}
