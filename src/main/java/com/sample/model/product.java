package com.sample.model;

public class product {
	private int id;
	private String name;
	private String address;
	private float price;
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
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
