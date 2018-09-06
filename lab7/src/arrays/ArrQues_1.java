package arrays;

import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrQues_1 {
	static int[] arr=new int[]{34,25,11,13};
	
	public List getSorted(int arr[]){
		int[] arr1=new int[]{34,25,11,13,10};
		//String str=Arrays.toString(arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("*******************");
		System.out.println("After sorting");
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr1[j]);
		}
		System.out.println("*******************");
		for (int k = 0; k < arr.length; k++) {
			String str=Integer.toString(arr1[k]);
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		str=sb.toString();
		arr1[k]=Integer.parseInt(str);
		
	}
		System.out.println("After reversing");
		List ll=new ArrayList();
		for (int l = 0; l < arr.length; l++) {
			
		
		System.out.println(arr1[l]);
		ll.add(arr1[l]);
		}
		//List ll=new ArrayList();
		/*for (int m = 0; m < arr.length; m++) {
			
			System.out.println(arr1[m]);
			
		}*/
		Collections.sort(ll);
		//System.out.println(ll);
		return ll;
		//List brr=Arrays.asList(34,25,11,13,10);
		
		//String st=Integer.toString(brr);
		/*Collections.sort(brr);
		System.out.println(brr);
		Collections.reverse(brr);
		System.out.println(brr);
		return brr;*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrQues_1 a=new ArrQues_1();
		 List list=a.getSorted(arr);
		 System.out.println(list);
		
		
		/*int[] arr=new int[]{34,25,11,13};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*******************");
		System.out.println("After sorting");
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("*******************");
		for (int k = 0; k < arr.length; k++) {
			String str=Integer.toString(arr[k]);
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		str=sb.toString();
		arr[k]=Integer.parseInt(str);
		
	}
		for (int l = 0; l < arr.length; l++) {
			
		
		System.out.println(arr[l]);
		}
		List ll=new ArrayList();
		for (int m = 0; m < arr.length; m++) {
			
			System.out.println(arr[m]);
			
		}
		List brr=Arrays.asList(34,25,11,13,10);
		
		//String st=Integer.toString(brr);
		Collections.sort(brr);
		System.out.println(brr);
		Collections.reverse(brr);
		System.out.println(brr);*/
		
		

	}

	
	

}
