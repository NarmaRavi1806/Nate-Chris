package lambdastream;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Lab11_5 implements Factorial{
	


	public int n;
	 Lab11_5(int n){
		this.n=n;
		fact(n);
	}
	 Lab11_5(){
		 
	 }
	public  void fact(int i){
		int f=1;
		for(int k=1;k<=i;k++){
			f=f*k;
			//return f;
		}
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Factorial f = Lab11_5::new;
		f.fact(n);
		//Factorial ff=(Factorial) new Lab11_5();
//		IntConsumer c=(x)->{//fact(x);
//		
//		System.out.println("Factorial="+ x*fact(x-1));		
//		};
//		c.accept(9);
//		Consumer<Integer> cc=System.out::println;
////		cc.accept(9);


	}

}
