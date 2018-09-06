package com.cg;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@NamedQuery(name="getAllUsers",query="Select u from UserDetails u")
@Table(name="User_Details")
public class UserDetails {
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy=GenerationType.AUTO) //Id should be generated Automatically
	private int userId;
	@Column(name="User_Name")
	private String userName;
	
	@OneToMany
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Column(name="User_Gender")
	private String gender;
	
	private int age;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
