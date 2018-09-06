package com.cg.author;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AuthorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	int authorId;
	String firstName;
	String middlename;
	String lastName;
	double phoneNo;
	@Override
	public String toString() {
		return "AuthorDetails [authorId=" + authorId + ", firstName="
				+ firstName + ", middlename=" + middlename + ", lastName="
				+ lastName + ", phoneNo=" + phoneNo + "]";
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}

}
