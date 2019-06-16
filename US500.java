package com;


public class US500 {
	
	public String firstname;
	public String lastname;
	public String companyname;
	public String address;
	public String city;
	public String country;
	public String state;
	public String zip;
	public String phoneno1;
	public String phoneno2;
	
	public String email;
	public String webmail;
	public US500(String firstname, String lastname, String companyname,
			String address, String city, String country, String state,
			String zip, String phoneno1, String phoneno2, String email,
			String webmail) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.companyname = companyname;
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.phoneno1 = phoneno1;
		this.phoneno2 = phoneno2;
		this.email = email;
		this.webmail = webmail;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneno1() {
		return phoneno1;
	}
	public void setPhoneno1(String phoneno1) {
		this.phoneno1 = phoneno1;
	}
	public String getPhoneno2() {
		return phoneno2;
	}
	public void setPhoneno2(String phoneno2) {
		this.phoneno2 = phoneno2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebmail() {
		return webmail;
	}
	public void setWebmail(String webmail) {
		this.webmail = webmail;
	}
	
	
	
	
	
}