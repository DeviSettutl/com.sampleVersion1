package com.sample.model;

public class Category {
	private int id;
	private String catName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", catName=" + catName + "]";
	}
	

}
