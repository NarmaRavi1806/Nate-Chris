package arrays;
import java.util.*;

public class EmployeeServiceImpl {
	

	Scanner sc=new Scanner(System.in);
		HashMap<String,Employee> list = new HashMap<>(); 
		Employee emp=new Employee();
		
		/*list.put("Employee 1",new Employee(1234,"saritha",10000,"SystemAssociate","Scheme C"));
		list.put("Employee 2",new Employee(1235,"madhan",50000,"Manager","Scheme A"));
		list.put("Employee 3",new Employee(1236,"manohar",30000,"Programmer","Scheme B"));
		list.put("Employee 4",new Employee(1237,"reema",70000,"Manager","Scheme A"));
		list.put("Employee 5",new Employee(1239,"krish",5000,"Clerk","no Scheme"));*/
			
		private void addEmployee()	{
				//code to add employee
			Employee emp=new Employee();
			
			System.out.println("Enter the employee id: ");
			emp.setId(Integer.parseInt(sc.next()));
			System.out.println("Enter name: ");
			emp.setName(sc.nextLine());
			System.out.println("Enter salary: ");
			emp.setSalary(sc.nextLong());
			
			System.out.println("Enter designation: ");
			emp.setDesignation(sc.nextLine());
		}
			
			
			/*System.out.println("Enter the Insurance Scheme:");
			emp.insuranceScheme=sc.nextLine();
			list.put("Employee 1",new Employee(1234,"saritha",10000,"SystemAssociate","Scheme C"));
			list.put("Employee 2",new Employee(1235,"madhan",50000,"Manager","Scheme A"));
			list.put("Employee 3",new Employee(1236,"manohar",30000,"Programmer","Scheme B"));
			list.put("Employee 4",new Employee(1237,"reema",70000,"Manager","Scheme A"));
			list.put("Employee 5",new Employee(1239,"krish",5000,"Clerk","no Scheme"));
			if(emp.insuranceScheme.equals("Scheme C")){
			list.put("Employee 1",new Employee(1234,"saritha",10000,"SystemAssociate","Scheme C"));
			}
			//System.out.println(list);
			if(emp.insuranceScheme.equals("Scheme A")){
			list.put("Employee 2",new Employee(1235,"madhan",50000,"Manager","Scheme A"));
			list.put("Employee 4",new Employee(1237,"reema",70000,"Manager","Scheme A"));
			}
			//System.out.println(list);
			if(emp.insuranceScheme.equals("Scheme B")){
			list.put("Employee 3",new Employee(1236,"manohar",30000,"Programmer","Scheme B"));
			}
			if(emp.insuranceScheme.equals("no Scheme")){
				list.put("Employee 5",new Employee(1239,"krish",5000,"Clerk","no Scheme"));
			}
			System.out.println(list);
			//list.put("Employee 4",new Employee(1237,"reema",70000,"Manager","Scheme A"));
		
		}*/
		public boolean deleteEmployee()	{
//		     code to delete a employee whose id is passed as parameter
			//Employee emp=new Employee();
			list.put("Employee 1",new Employee(1234,"saritha",10000,"SystemAssociate","Scheme C"));
			list.put("Employee 2",new Employee(1235,"madhan",50000,"Manager","Scheme A"));
			list.put("Employee 3",new Employee(1236,"manohar",30000,"Programmer","Scheme B"));
			list.put("Employee 4",new Employee(1237,"reema",70000,"Manager","Scheme A"));
			list.put("Employee 5",new Employee(1239,"krish",5000,"Clerk","no Scheme"));
			Scanner sb=new Scanner(System.in);
			int id1;
			System.out.println("Enter the id to be deleted:");
			id1=sb.nextInt();
			if(id1==emp.id){
				list.remove(emp.id);
				System.out.println(list);
				return true;
			}else{
				System.out.println("The Id number is not available");
				return false;
			}
			
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServiceImpl empl=new EmployeeServiceImpl();
		empl.addEmployee();
		empl.deleteEmployee();
		String op=null;
		while(true){
			System.out.println("1. Add an employee");
			System.out.println("2. view employee by insurance scheme");
			System.out.println("3.delete Employee");
			System.out.println("4.sort employees by salary");
			System.out.println("5.exit");
			System.out.println("Enter your choice:");
			op=empl.sc.nextLine();
			switch(op){
			case "1":
				empl.addEmployee();
				break;
			}
		}

	}
	}

