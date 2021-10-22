package com.bridgelabz;

public class AddressBookMain {
	private String firstName ;
	private String lastName ;
	private String address ;
	private String city;
	private String zip ;
	private String phoneNumber ;
	private String emailId ;

	//setters method
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	//Getters method

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getZip() {
		return zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}

	//parameterized constructors
	public AddressBookMain(String a,String b,String c, String d,String e,String f,String g) {
		setFirstName(a);
		setLastName(b);
		setAddress(c);
		setCity(d);
		setZip(e);
		setPhoneNumber(f);
		setEmailId(g);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
	}



}
