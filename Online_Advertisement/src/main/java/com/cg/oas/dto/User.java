package com.cg.oas.dto;

public class User 
{
	private int id;
	private String name;
	private String address;
	private String contactno;
	private String email;
	public User(int id, String name, String address, String contactno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactno = contactno;
		this.email = email;
	}
	public User(String name, String address, String contactno, String email) {
		super();
		this.name = name;
		this.address = address;
		this.contactno = contactno;
		this.email = email;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contactno=" + contactno + ", email="
				+ email + "]";
	}
}
