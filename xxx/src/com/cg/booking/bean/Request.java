package com.cg.booking.bean;

import java.time.LocalDate;

public class Request {
	private int requestId;
	private String customerName;
	private String phone;
	private LocalDate dateOfRequest;
	private String requestStatus,cabNumber,addrOfPickup;
	private String pincode;
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public LocalDate getDateOfRequest() {
		return dateOfRequest;
	}
	public void setDateOfRequest(LocalDate dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getCabNumber() {
		return cabNumber;
	}
	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}
	public String getAddrOfPickup() {
		return addrOfPickup;
	}
	public void setAddrOfPickup(String addrOfPickup) {
		this.addrOfPickup = addrOfPickup;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
