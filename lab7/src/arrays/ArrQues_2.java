package arrays;

import java.util.*;
import java.util.List;

public class ArrQues_2 {
	
	public List Quesarr(String S1 , String S2){
		List list = new ArrayList();
		String str[]=S1.split("");
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder(S2);
		
		//7.2.1
		for (int i = 0; i < str.length; i++) {
			if(i%2 != 0){
				str[i]=S2;
			}
			sb1.append(str[i]);
			}
		list.add(sb1.toString());
		S1=sb1.toString();
	
	
	//7.2.2
	
	if(S1.indexOf(S2) != S1.lastIndexOf(S2)){
		sb2.reverse();
		String reverse=sb2.toString();
		int x=S1.lastIndexOf(S2);
		S1=S1.substring(0,x).concat(reverse);
	}else{
		S1=S1.concat(S2);
	}
	list.add(S1);
	
	//7.2.3
	
	if(S1.indexOf(S2) != S1.lastIndexOf(S2)){
		int x=S1.indexOf(S2);
		S1=S1.substring(0,x).concat(S1.substring(x+1));
		//sb1=new StringBuilder(S1);
		list.add(S1);
		}else{
			list.add(S1);
		}
	
	//7.2.4
	
	String str1="";
	char ch[]=S2.toCharArray();
	int l=ch.length;
	if(l%2==0){
		for (int i = 0; i < l/2; i++) {
			str1=str1+ch[i];
		}
		str1=str1+S1;
		for (int i = l/2; i < l; i++) {
			str1=str1+ch[i];
		}
	}else{
		for (int i = 0; i <(l/2)+1 ; i++) {
			str1=str1+ch[i];
		}
		for (int i = (l/2)+1; i <l; i++) {
			str1=str1+ch[i];
		}
	}
	S1=str1;
	list.add(S1);
	
	//7.2.5
	
	for (int i = 0; i < S1.length(); i++) {
		for (int j = 0; j < S2.length(); j++) {
			if(S1.charAt(i)==S2.charAt(j)){
				S1=S1.replace(S1.charAt(i),'*');
			}
		}
	}
	list.add(S1);
	
	//7.2.2
	
		/*if(S1.indexOf(S2) != S1.lastIndexOf(S2)){
			sb2.reverse();
			String reverse=sb2.toString();
			int x=S1.lastIndexOf(S2);
			S1=S1.substring(0,x).concat(reverse);
		}else{
			S1=S1.concat(S2);
		}
		list.add(S1);*/
	
	return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String str=sc.nextLine();
		System.out.println("Enter the Second String: ");
		String str2=sc.nextLine();
		ArrQues_2 a=new ArrQues_2();
		List list1= a.Quesarr(str,str2);
		System.out.println(list1);
		
		/*String S1="Arraylist";
		String S2="lit";
		char ch[]=S1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("*****************************");
		char ch2[]=S2.toCharArray();
		for (int j = 0; j < ch2.length; j++) {
			System.out.println(ch2[j]);
		}
		System.out.println("*****************************");
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if(ch[i]==ch2[j]){
					ch[i]='*';
					//System.out.println(ch[i]);
				}
				
			}
			System.out.println(ch[i]);
			
		}
		//System.out.println(ch[i]);
		System.out.println("*****************************");
		int l=ch2.length;
		int a=0,m=(l/2)+1;
		String f="";
		String h="";
		if(!(l%2==0)){
			for(int k=0;k<m;k++){
				f=f+ch2[k];
			}
			h=h+ch[a];
			a++;
			
			for(int n=m;n<l/2;n++){
				h=h+ch2[n];
				System.out.println(h);
			}
			//System.out.println(h);
		}else{
			for(int k=0;k<l/2;k++){
				f=f+ch2[k];
			}
			h=f+ch[a];
			a++;
			for(int n=l/2;n<l;n++){
				h=h+ch2[n];
				System.out.println(h);
			}
			//System.out.println(h);
		}*/
		
		
		//List list=new ArrayList();
		//list.add("Arraylist");
		//list.add("List");
		

	}

}
