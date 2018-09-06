package maps;
import java.util.*;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> tm=new TreeMap<>();
		
		tm.put("tun","ndev");
		tm.put("ryrtu","ryru");
		tm.put("urt","jytd");
		tm.put("yiku","tuyi");
		
		for (Object str : tm.keySet()) {
			
			System.out.println(str+":"+tm.get(str));
		}
			TreeMap<Integer,Employee> emp=new TreeMap<>();
			emp.put(1001,new Employee(108,"sindu","female",43,34550));
			emp.put(1002,new Employee(107,"kala","female",41,36550));
			emp.put(1003,new Employee(106,"veer","male",21,76550));
			emp.put(1004,new Employee(105,"varatha","male",23,44550));
			String op=null;
			Scanner sc=new Scanner(System.in);
			while(true){
				System.out.println("display all employees");
				System.out.println("display employee by id");
				System.out.println("exit");
				System.out.println("Enter your choice:");
				op=sc.nextLine();
				switch(op){
				case "1":
					for (Employee e : emp.values()) {
						System.out.println(e);
					}
					break;
				case "2":
					System.out.println("Enter the EMployee id:");
					int id=Integer.parseInt(sc.nextLine());
					Employee em=emp.get(id);
					System.out.println(em);
				
				break;
				case "3":
					System.exit(0);
					break;
			    default :
						System.out.println();
						System.err.println("invalid option, please select from 1 to 3");
						System.out.println();
						break;
			}
			
		}

	}
}


