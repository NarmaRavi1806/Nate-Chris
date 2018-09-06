package arrays;
import java.util.*;
import java.util.function.Function;

public class ArrQues_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Santhiya");
		list.add("Geetha");
		list.add("Gowtham");
		list.add("Saranya");
		list.add("varsha");
		list.add("Snegha");
		list.add("Subash");
		list.add("Divya");
		list.add("Sindhu");
		list.add("Karthick");
		System.out.println("List before Sorting");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("List after Sorting");
		System.out.println(list);
		
		 /*List<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(1);
		    numbers.add(2);
		    numbers.add(3);

		    Function<Integer, Integer> square = x -> x * x;
		    numbers.stream().map(square).forEach(x -> System.out.println(x));

		   List<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(1);
		    numbers.add(2);
		    numbers.add(3);

		    for(Integer num : numbers) {
		        System.out.println(num * num);
		        System.out.println(numbers);
		    }
		    System.out.println(numbers);*/


		

	}

}
