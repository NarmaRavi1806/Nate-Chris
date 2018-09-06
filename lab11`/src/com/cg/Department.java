package com.cg;

public class Department {
	
	int DeptId;
	String Deptname;
	int managerId;
	
	
	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + ", Deptname=" + Deptname
				+ ", managerId=" + managerId + "]";
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
