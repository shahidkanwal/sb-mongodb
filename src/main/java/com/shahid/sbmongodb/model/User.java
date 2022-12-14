package com.shahid.sbmongodb.model;


import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "users")
public class User {
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	private int id;
	private String name;
	private String description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
