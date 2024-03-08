package com.RestuarantAuth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Restauregistration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String restuarantname;
	private String emailID;
	private String gstNumber;
	private Long phoneNumber;
	private String password;
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestuarantname() {
		return restuarantname;
	}
	public void setRestuarantname(String restuarantname) {
		this.restuarantname = restuarantname;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
  

}
