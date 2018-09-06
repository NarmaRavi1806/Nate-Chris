package maps;

import java.util.*;

public class A1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(123,"rrrrt");
		map.put(124,"rinok");
		map.put(125,"rijn n");
		map.put(126,"ruhu");
		map.put(127,"runt");
		
		for (Object string : map.values()) {
			
			System.out.println(string);
			
		}
for (Object strr : map.keySet()) {
			
			System.out.println(strr);
			
		}
for (Object str : map.keySet()) {
			
			System.out.println(str+":"+map.get(str));
			
		}
for(Map.Entry<Integer,String> entry:map.entrySet()){
	System.out.println(entry.getKey()+":"+entry.getValue());
}

	}

}
