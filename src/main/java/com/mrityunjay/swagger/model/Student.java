package com.mrityunjay.swagger.model;

public class Student {

	private long id;
	private String name;
	private String address;

	private String mobileNumber;
	private String email;

	public Student(long id, String name, String address, String mobileNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
