package arrays;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ArrQues_3 {
	
	public List removeElements(){
		List<String> list1=new ArrayList<>();
		list1.add("boa");
		list1.add("penstripe");
		list1.add("pastel");
		list1.add("albino");
		list1.add("het");
		System.out.println(list1);
		
		
		List<String> list2=new ArrayList<>();
		list2.add("cat");
		list2.add("dog");
		list2.add("moon fish");
		list2.add("parrot");
		list2.add("het");
		list2.add("albino");
		System.out.println(list2);
		
		list2.removeAll(list1);
		//System.out.println(list1);
		System.out.println(list2);
		return list2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrQues_3 a=new ArrQues_3();
		a.removeElements();
		
		/*List<String> list1=new ArrayList<>();
		list1.add("boa");
		list1.add("penstripe");
		list1.add("pastel");
		list1.add("albino");
		list1.add("het");
		System.out.println(list1);
		
		
		List<String> list2=new ArrayList<>();
		list2.add("cat");
		list2.add("dog");
		list2.add("moon fish");
		list2.add("parrot");
		list2.add("het");
		list2.add("albino");
		System.out.println(list2);
		
		list2.removeAll(list1);
		System.out.println(list1);
		System.out.println(list2);*/

	}

}
