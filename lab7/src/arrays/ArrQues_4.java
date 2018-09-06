package arrays;
import java.util.*;

public class ArrQues_4 {
	public Map getSquares(){
		Map<Integer,Integer> map = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		map.put(101, sc.nextInt());
		map.put(102, sc.nextInt());
		map.put(103, sc.nextInt());
		map.put(104, sc.nextInt());
		 for(Integer num : map.values()) {
		        System.out.println(num * num);
		        //System.out.println(num+":"+map.get(num));
		        //System.out.println(map);
		 }
		
		 return map;
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrQues_4 aa=new ArrQues_4();
		Map set=aa.getSquares();
		System.out.println(set);
		

	}

}
