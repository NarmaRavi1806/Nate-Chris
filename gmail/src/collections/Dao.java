package collections;

import java.util.List;

public class Dao {
	
	private List list;
	
	public void insert(Employeeobj e){
		list.add(e);
	}
	public void delete(Employeeobj e){
		list.remove(e);
	}
	public void print(){
		for (Object object : list) {
			System.out.println(object);
			
		}
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Dao() {
		// TODO Auto-generated constructor stub
	}

}
